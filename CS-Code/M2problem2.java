public class M2problem2 {

    public static void fillLine(String[] a){
        String[] list = new String[a.length];
        list = StdIn.readAllStrings();
        for(int i =2; i <list.length; i++){
            a[i-2]=list[i];
        }
    }

    public static void printLine(String[] a){
        for(String student: a){
            System.out.print(student);
            System.out.print(" ");
        }
    }

    public static void fillRoom(String[] a, String[][] rm){
        int namecount = 0;
        for(int i =0; i < rm.length; i++){
            for(int j=0; j<rm[i].length; j++){
                rm[i][j] = a[namecount];
                namecount++;
            }
        }
    }

    public static void printRoom(String[][] rm){
        for(int i=0; i<rm.length; i++){
            for (int j=0; j<rm[i].length; j++){
                System.out.print(rm[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void fillLineByCol(String[][] rm, String[] a){
        int counter = 0;
        for(int i=0; i<rm.length; i++){
            for(int j=0; j<rm[i].length; j++){
                a[counter] = rm[j][i];
                counter++;
            }
        }
    }


    public static void main(String[] args){
       int r = Integer.parseInt(args[0]);
       int c = Integer.parseInt(args[1]);
       String[] studentLine = new String[r*c];
       String[][] room = new String[r][c];
    }
}