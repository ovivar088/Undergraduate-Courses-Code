
public class guessingGame{
    
    public static void main(String[] args){
        int guessIt = 1+ (int)(Math.random()*1000);
        System.out.println(guessIt);
        int guess = 0;


        while(guessIt != guess) {
            System.out.println("Take an integer guess");
            guess = StdIn.readInt();
        
        if(guessIt != guess){
            if(guessIt > guess){
                System.out.println("Guess is too Small");}
            if(guessIt < guess) {
                System.out.println("Guess is too big");}
            
        }
        if (guess == guessIt){
            System.out.println("You got it King!");

        }
        }
            }
    
        }
        
    
