#include <iostream>
#include <vector>
#include <unordered_map>
//The test bench

std::vector<int> twosum(std::vector<int> nums, int target)
{
    std::vector<int> indices(2); //initialization
       int size = nums.size();
       std::cout << " " << size << "\n";
       int diff;
       std::unordered_map<int, int> map;
        int i;
        for( int i = 0; i < size; i++)
        
            diff = target - nums[i]; //what value are we looking for?
            std::cout << "Difference is " << diff << "\n";
            //int diff_2 = map.find(diff);
            //std::cout << "Lets See what this nibba is about :" << diff2 << "\n";
            if(map.find(diff) != map.end() && map.find(diff) -> second != i)
            {
                indices.push_back(i);
                indices.push_back(map.find(diff)->second);
                return indices;
            }
            map[nums[i]] = i;
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

    for (int i = 0; i < a.size(); i++) //printing array
    {
        std::cout << a[i] << "\t";
    }
    std::cout << "\n";

    std::vector<int> output(2);
    output = twosum(a,5);
    std::cout << output[0] << " " << output[1] << "\n";


    //{1, 7, 6, 3, 4, 9};//target is 11
    
  


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