#include <iostream>
#include <vector>
#include <algorithm>
//The test bench


//two pointer technique , i and j. Only works for sort array.
std::vector<int> twosum(std::vector<int> nums, int size, int target)
{
    std::vector<int> indices(2); //initialization
    std::vector<int> copy;
    copy = nums;
    sort(nums.begin(), nums.end());
    for (int i=0, j = size-1; i<j;)
    {
        if(nums[i]+nums[j] > target)
        {
            j--; //decrement
        }
        else if(nums[i]+nums[j] < target)
        {
            i++;
        }
        else
        {
            indices[0] = i;
            indices[1] = j;
           // indices.push_back(i);
           // indices.push_back(j); 
            return indices; //returning true if it is equal, not really what we want
        }
    }
    
    return indices;
 

}

//Does not really work how intended, the indices it gives out are the indices
//of the sorted array not the original array.

int main()
{
    std::vector<int> a(6);
    a[0] = 1;
    a[1] = 7;
    a[2] = 6;
    a[3] = 3;
    a[4] = 4;
    a[5] = 9;

    for (int i = 0; i < a.size(); i++)
    {
        std::cout << a[i] << "\t";
    }
    std::cout << "\n";

    std::vector<int> output(2);
    output = twosum(a,a.size(),5);
    std::cout << output[0] << " " << output[1] << "\n";


    //{1, 7, 6, 3, 4, 9};//target is 11
    
    /*
    std::sort(nums, nums+6);
    for (int i=0; i<6;i++)
    {
        std::cout << nums[i] << "\t"; 
    }
    */ //proving the sort function works as intended


}


/*learning
Stack - Any static variables, short variables for storage, known lifetime
Heap - Handles everything dynamic, "new", "delete"

const int arrSize = 10; "stack"
int statArr[arrsize]; "stack"

--------- making/deleting int in the heap
int *dynamicval = new int(10) , this is just an integer w value 10 same as int a = 10
delete dynamicval; (if you were deleting array its "delete [] dynamicArr")
--------- making array (where things get interesting)
int *dynamicArr = new int[arrSize]; , the pointer exists in the stack but the array is in the heap

if we were try to override previous array say:
dynamicArr = new int[20]; results in Memory Leak
--we forgot to delete the array before reassigning-- need to delete first




*/ 