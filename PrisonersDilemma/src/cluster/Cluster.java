
package cluster;
import java.util.LinkedList;

public class Cluster {
    int id;
    Point centroid;
    //returns energy
    LinkedList <Point> points;
    double energy;
    
    public void calculateCentroid(){};
    
    public void addPoint (Point p){};

    public int reassignPoints(){
        int x = 0;
        return x;
    }  
    //return number of re-assigns
    
    public void cluster(){};  //centroid is random
   
    public double getEnergy() {
    return(energy);
    }
}
