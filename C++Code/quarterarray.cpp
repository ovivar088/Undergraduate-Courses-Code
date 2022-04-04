#include <iostream>


#define arraylength(ar) (sizeof(ar)/4) //Length funciton



int main() 
{
int array[13] = {1,2,2,6,6,6,7,10,11,11,11,11,11};

int length = arraylength(array);
//std::cout << "Length is " << length << "\n";

for (int j=0;j<length-1;j++)
{
     int count = 1;
     //std::cout << " Value a[j] is " << array[j] << " count is " << count << "\n";
     
    
    for (int i=1; ((i+j) < length-1 && (array[j] == array[j+i])) ; i++) // We dont want our i to go past array bounds. Length
    {
        count++;
        //std::cout <<  "            count of " << array[j] << " is " << count << "\n";
        
    }
    int temporary = array[j];

    if (count > length/4)
    {
        std::cout << "\n This Value appears more than 25 percent of the time : " << temporary << "\n\n"; 
        return temporary;
        
    }



}
}