/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Osiel Vivar
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
        double tall = length * (Math.sqrt(3))/2;
        return tall;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
    double [] ex = { x-(length/2), x, x+(length/2)};
    double [] why = {y+(height(length)), y, y+height(length)};
    StdDraw.filledPolygon(ex, why);

	
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
        
        filledTriangle(x,y, length);

        if( n != 1){
            sierpinski(n-1, x-length/2, y, length/2);
            sierpinski(n-1, x+length/2, y, length/2);
            sierpinski(n-1, x, y+height(length), length/2);
        }
            


    }
    

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
    
    int n = Integer.parseInt(args[0]);

    double length = 1;
    
    StdDraw.line(0,0,1,0);
    StdDraw.line(1,0,.5,height(length));
    StdDraw.line(0,0,.5,height(length));


    sierpinski(n, .5, 0, length/2);


    }
}
