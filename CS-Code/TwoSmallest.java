/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:Osiel Vivar, ov35, ov35@scarletmail.rutgers.edu
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
    double theSmallest;
    double notQuite = Double.MAX_VALUE;
    int count = args.length;
    double[] list = new double[count];

for(int i=0; i < count; i++){
    list[i] = Double.parseDouble(args[i]);
   
}
theSmallest = list[0];
for(int i = 1; i < list.length; i++){
    if(theSmallest >= list[i]){
        notQuite = theSmallest;
        theSmallest = list[i]; 
    }
    else if(notQuite > list[i]){
        notQuite = list[i];
    }
}


System.out.println(theSmallest);
System.out.println(notQuite);

    }

}
