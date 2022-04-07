/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Osiel Vivar
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] arraycopy = new double[array.length];
	    for (int i=0; i< array.length; i++){
        arraycopy[i] = array[i]; }
        return arraycopy; 
    }

    
    
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

        for(int i=0; i < x.length; i++){
            x[i] = x[i] * alpha;
        }
        for(int i=0; i <y.length; i++){
            y[i] = y[i] * alpha;
        }


	
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        
        for(int i=0; i < x.length; i++){
            x[i] = x[i] + dx;
        }
        for(int i=0; i <y.length; i++){
            y[i] = y[i] + dy;
        }

	
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        double [] xcopy = copy(x);
        double radians = Math.toRadians(theta);

        for(int i=0; i < x.length; i++){
            x[i] = x[i]*(Math.cos(radians)) - y[i]*(Math.sin(radians));
        }
        for(int i=0; i <y.length; i++){
            y[i] = y[i]*(Math.cos(radians)) + xcopy[i]*(Math.sin(radians));
        }
	
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
        


        StdDraw.setScale(-5.0, 5.0);
       /* double[] x = {0, 1, 1, 0};
        double[] y = {0, 0, 2, 1};
        double alpha = 2.0;
        
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x,y);
        
        scale(x, y, alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double dx = 2.0; 
        double dy = 1.0; 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        translate(x, y, dx, dy); 
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y); */

         double[] x = { 0, 1, 1, 0 }; 
         double[] y = { 0, 0, 2, 1 }; 
         double theta = 30.0; 
         StdDraw.setPenColor(StdDraw.RED); 
         StdDraw.polygon(x, y); 
         rotate(x, y, theta); 
         StdDraw.setPenColor(StdDraw.BLUE);
         StdDraw.polygon(x, y); 

         

       
        
    }
}
