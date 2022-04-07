public class M2problem4 {


    public static void nonrecursiveinfinity(){
        while(true){
            System.out.println("ongoing");
        }
    }
    public static void recursiveinfinity(){
        recursiveinfinity();
        System.out.println("loop");
    }
    public static void f(){
        g();
        
    }
    public static void g(){
        f();
        
    }

    public static void main(String[] args){ 
        
        recursiveinfinity();

    }
}