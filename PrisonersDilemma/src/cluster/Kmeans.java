package cluster;

import java.util.ArrayList;
import java.util.LinkedList;

public class Kmeans {
    ArrayList <Cluster> c;
    double totalDistanceFromCentroids;
    double StopAt = 0.01;
    public void init (LinkedList <Point> data, int k) {
  //k is number of clusters you want
  //this will create k clusters, assign every point in data,
  // add point to random cluster
    }
 
public double iteration(){
        totalDistanceFromCentroids = 0.0;
    //for every cluster, reassigns points by calling from cluster class
    //for every cluster, energy+ = getEnergy()
       return(totalDistanceFromCentroids);
     }
 
public void run() {
        prevEnergy = max_double;
        do {totalDistanceFromCentroids = doIteration()
                while (prevTotalDistance - totalDistanceFromCentroids < StopAt)
    //or poison pill with max 1000 runs...
                }
    }
}

