/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author: Osiel Vivar, ov35, ov35@scarletmail.rutgers.edu
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sevenCount = 0;
        int remainder;
        
        while (number != 0 ){
            remainder = number%10;
            if(Math.abs(remainder) == 7){
                sevenCount++;
            }
            number = number/10;

        }
System.out.println(sevenCount);


	
    }

}
