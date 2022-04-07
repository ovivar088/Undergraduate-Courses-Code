/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:Osiel Vivar, ov35, ov35@scarletmail.rutgers.edu
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int integer1 = Integer.parseInt(args[0]);
        int integer2 = Integer.parseInt(args[1]);
        int integer3 = Integer.parseInt(args[2]);
        int integer4 = Integer.parseInt(args[3]);
        int integer5 = Integer.parseInt(args[4]);

        int largestinteger = integer1;

        if (largestinteger < integer2){
            largestinteger = integer2;
        }
        if (largestinteger < integer3){
            largestinteger = integer3;
        }
        if (largestinteger< integer4){
            largestinteger = integer4;
        }
        if (largestinteger < integer5){
            largestinteger = integer5;
        }
        System.out.println(largestinteger);
    }
   
}