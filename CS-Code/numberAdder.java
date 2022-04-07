public class numberAdder {
    public static void main (String[] args){
        
        int number = IntegerparseInt(args[0]);
        int sum = 0;
while (number >= 1){
     sum = sum + number;
    number = number - 1;
}
    }
}