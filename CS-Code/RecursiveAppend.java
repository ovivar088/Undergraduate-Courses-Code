/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Osiel Vivar ov35
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

    if (n > 0){
        return original + appendNTimes(original,n-1);
        
    }
    return original;

    }

    public static void main (String[] args) {

    
    }
}
