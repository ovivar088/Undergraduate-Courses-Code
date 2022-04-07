public class Array2 {
    
        public static void main(String[] args){
            //initialize an array with the command line arguments
            //will be integers
            int nbrCommandLineArgs = args.length;

            //declare an array to store all command line arguments
            int[] items = new int[nbrCommandLineArgs];

            //loop to read and store each command line arguments
            for (int i =0; i<nbrCommandLineArgs; i++){
                int argument = Integer.parseInt(args[i]); //read
                items[i] = argument; //store into array position i
            }
            for (int i =0; i < items.;ength; i++){
                System.out.print(items[i] + " ")

            }
            //sum the values of the array
            int sum = 0;
            for(int i=0; i< items.length; i++){
                sum = sum+items[i];

            }
            System.out.println(" -> the sum is" + sum);
        }
}