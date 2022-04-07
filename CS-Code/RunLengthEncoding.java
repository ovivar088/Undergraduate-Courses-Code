/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author:Osiel Vivar ov35
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  {

        if (original.length() == 0) {

            return "";
      }

      String encoded = "";


      char first = original.charAt(0);


      int counter = 1;


      for (int i = 1; i < original.length(); i++) {

            char current = original.charAt(i);


            if (first != current) {

            
                  if (counter == 1){
                        encoded += first;
                  } else {
                        encoded += "" + counter + first;
                  }
                  first = current;

                  counter = 1;

            } else {
                  counter++;
            }
      }
      if (counter == 1) {
            encoded += first;}
       else {
            encoded += "" + counter + first;
      }

      return encoded;
}
    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original)  {
        if (original.length() == 0) {

            return "";

      }

      // getting first character

      char first = original.charAt(0);

      // checking if it is a digit

      if (Character.isDigit(first)) {

            int digit = first - '0';

            if (digit == 0) {

                  return decode(original.substring(2));

            } else {

                  int prevDigit = digit - 1;

                  return original.charAt(1)+ decode(prevDigit + original.substring(1));
            }

      } else {

            // if c is not a digit, simply returning c concatenated with decode

            // operation of remaining characters ignoring first character

            return first + decode(original.substring(1));

      }

}
// Tests each of the API methods by directly calling them.
public static void main(String[] args) {

}

}