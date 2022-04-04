#include <iostream>
#include<stdio.h>
 

void swap(int* a, int* b)
{
    int t = *a;
    *a = *b;
    *b = t;
}
 

int partition (int arr[], int p, int r)
{
    int pivot = arr[r];    // pivot
    int i = (p - 1);  // Index of smaller element
 
    for (int j = p; j <= r- 1; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (arr[j] <= pivot)
        {
            i++;    // increment index of smaller element
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[r]);
    return (i + 1);
}
 
//Quick sort to be called by main
void quickSort(int arr[], int p, int r)
{
    if (p < r)
    {
      
        int q = partition(arr, p, r);
 
       
        quickSort(arr, p, q - 1);
        quickSort(arr, q + 1, r);
    }
}
 
/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
 
// Driver program to test above functions
int main()
{
    int arr[] =  {49, 38, 65, 97, 76, 13, 27, 49};
    int n = sizeof(arr)/sizeof(arr[0]);
    quickSort(arr, 0, n-1);
    std::cout << "Sorted array: \n";
    printArray(arr, n);
    return 0;
}