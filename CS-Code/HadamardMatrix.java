/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author:
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {
        /*int n = Integer.parseInt(args[0]); 
        boolean h[][] = new boolean[n][n];
        h[0][0] = true;
        for(int k = 0; k<n; k+=2) //Controls Rows of the New Array H2N
           {
               for(int x = 0; x<n; x+= 2) //Controls Column of the New Array H2N
               {
                   for(int i = 0; i<2; i++) //Controls Rows of H2 Array
                   {
                       for(int j = 0; j<2; j++)
                       {
                           if(k >= (n/2) && x >= (n/2))
                           {
                               h[i+k][j+x] = !h[i][j];
                           }
                           else
                           {
                               h[i+k][j+x] = h[i][j];
                           }
                       }
                   }
               }
           }
           for(int i = 0; i < h[0].length; i ++){
               for(int j = 0; j < h.length; j++){
                   if(h[i][j])System.out.print("T ");
                   else System.out.print("F ");
               }
               System.out.println(); 
           }*/
                int n = Integer.parseInt(args[0]);
                boolean[][] hadamard = new boolean[n][n];
        
                // initialize Hadamard matrix of order n
                hadamard[0][0] = true;
                for (int k = 1; k < n; k += k) {
                    for (int i = 0; i < k; i++) {
                        for (int j = 0; j < k; j++) {
                            hadamard[i+k][j]   =  hadamard[i][j];
                            hadamard[i][j+k]   =  hadamard[i][j];
                            hadamard[i+k][j+k] = !hadamard[i][j];
                        }
                    }
                }
        
                // print matrix
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (hadamard[i][j]) System.out.print("T ");
                        else                System.out.print("F ");
                    }
                    System.out.println();
                }
            
        
        }
        

    }

