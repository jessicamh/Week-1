
package cluster;

public class Point {
    //declare x and y
    public double x;
    public double y;

    //setMin sets x and y to the lowest possible value for a double;
    //setMax sets x and y to the highest possible value for a double.
    public void setMin(){
        x = Double.MIN_VALUE;
        y = Double.MIN_VALUE;
    };
    
    public void setMax(){
        x = Double.MAX_VALUE;
        y = Double.MAX_VALUE;        
    };
    
    //"print" method prints "(x, y)"
    public void print(){
        System.out.println("(" + x + ", " + y + ")");
    }
}
