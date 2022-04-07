/*************************************************************************
 *  Compilation:  javac ISBNChecksum.java
 *  Execution:    java ISBNChecksum 020131452
 *
 *  @author: Osiel Vivar, ov35@scarletmail.rutgers.edu, ov35
 *
 *  Takes a 9-digit integer as a command line argument, then computes
 *  and prints the checksum character
 *
 *  % java ISBNChecksum 020131452
 *  5
 *
 *  Print only the checksum character, nothing else.
 *
 *************************************************************************/


public class ISBNChecksum {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        int sum = 0;
        int multiplier = 2;
        int toBeAdded = 0;
        int toBeMultiplied = 0;
        int remainder = 0;
        int checksum = 0;
        
        while (number>0){
            toBeMultiplied = number%10;
            toBeAdded = toBeMultiplied*multiplier;
            sum = sum + toBeAdded;
            multiplier = multiplier + 1;
            number = number/10;
            
        }
        
        

        
            remainder = sum%11;
                if (remainder==0){
                    checksum = remainder;
                    System.out.println(checksum);
                }
                
                else { 
                    checksum = 11 - remainder;
                    if (checksum == 10){
                    System.out.println("X");
                }
                    else {
                        System.out.println(checksum);
                    }
                
                } 
        
    
    
}
}