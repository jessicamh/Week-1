
package cluster;
import java.util.LinkedList;

public class Cluster {
    //declare centroid, system "energy" (total distance from centroid),
    //cluster itself (as LinkedList, for holding the points)
    Point centroid = new Point();
    LinkedList <Point> points = new LinkedList <Point>();
    double totalDistanceFromCentroids = Double.MAX_VALUE;
    
    //method calculate Centroid: start one at 0,0; 
    public void calculateCentroid(){
        centroid.x = 0d;
        centroid.y = 0d;
        
        //add up all the x's and y's in the cluster and divide by
        //number of points in the cluster to get new average (x,y)
        Double totalX = 0.0;
        Double totalY = 0.0;
        int n = points.size();
        for (Point aPoint : points){
            totalX += aPoint.x;
            totalY += aPoint.y; }
        centroid.x = totalX / n;
        centroid.y = totalY / n;
    }
    
    //set the centroid to "newCentroid"; return the centroid
    public void setCentroid(Point newCentroid){
        centroid = newCentroid;
    }
    public Point getCentroid() {
        return(centroid);
    }

    //add a point to the cluster
    public void addPoint (Point p){
        points.add(p);
    }

    //clear all points from the cluster
    public void resetPoints(){
        points.clear();
        totalDistanceFromCentroids = Double.MAX_VALUE;
    }

    //to get the totalDistance ("energy"): initialize to 0.0, 
    //make a new EUDistance (or insert other distance type),
    //sum the distance from each point to the centroid, return the total.
    public double getTotalDistanceFromCentroid() {
        double totalDistanceFromCentroid = 0d;
        EUDistance distance = new EUDistance();
        for (Point point : points) {
            totalDistanceFromCentroid += distance.getDistance(point, centroid);
        }
        return(totalDistanceFromCentroid);

    } //end of method

} //end of class
