public class problem1{



    public static String[] makeNames( String[] array1, String[] array2){
        if(array1.length == 0)
        return array2;
        if(array2.length == 0)
        return array1;
        String[] mergedArray = new String[array1.length*array2.length];
        for(int i =0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                mergedArray[j+array2.length*i] = array1[i] + " " + array2[j];
            }
        }
        return mergedArray;
    }

    public static String[] makeNames(String[] array1, String[] array2, String[] array3)
    {  // String[] array4 = new String[array1.length*array2.length*array3.length];
        String[] loaded = makeNames(array1, array2);
        String[] overloaded = makeNames(loaded, array3);
        return overloaded;
    }
    public static void print(String[] array){
        for(String i:array){
            System.out.println(i);
        }
    }

    public static void main(String[] args){

       //insert strings and main function commands
        
    }
}