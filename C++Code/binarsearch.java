public class binarsearch{


    public static int binarySearch (int[] a, int target) {
        
         int left = 0;
         int right = a.length - 1;
        
         while ( left <= right ) {
        
        int middle = ( left + right ) / 2;
         if ( a[middle] == target ) {
        return middle;
        } else if ( target < a[middle] ) {
        right = middle - 1;
         } else {
        left = middle + 1;
         }
         }
         return -1; // target not found

        }
    public static void main(String[] args){

    int[] numbers = {-1,0,3,5,9,12};
    int index = binarySearch(numbers, 9);
    System.out.println(index);
    
    }
}