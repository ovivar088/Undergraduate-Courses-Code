public class M2problem3 {
    
         public static void bop(int x) {
            x = 0;
         }
         public static void biff(int[] arr) {
         for (int i=0; i < arr.length; i++)
            arr[i] = arr[i] + 1;
         }
         public static void ugh(int[] arr) {
            arr = new int[arr.length];
         }
         public static void main(String[] args) {
            int x = 205;
            bop(x);
            System.out.println(x);
        
            int[] a = {2, 0, 5};
            biff(a);
            for (int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
        
         int[] b = {20, 10};
         ugh(b);
         for (int i=0; i < b.length; i++)
         System.out.print(b[i] + " ");
         System.out.println();
         }
         } 
