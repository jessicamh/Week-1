
package cluster;

public class ManhattanDistance implements Distance {
     @Override
    public double getDistance(Point A, Point B){
       return (Math.abs(A.x - B.x) + Math.abs(A.y - B.y));
    }    
}
