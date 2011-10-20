package cluster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Kmeans {
    //make list of clusters, declare total system distance variable,
    //initialize stopping conditions
    ArrayList <Cluster> clusters = new ArrayList<Cluster>();
    double systemDistanceFromCentroids; //"energy" or "entropy"
    double prevTotalDistance;
    double StopAt = 0.01;
    int k;   //set up some more stopping conditions
    int maxIterations = 100; // ^^
    Data values = new Data();  //declare new data called "values"
    Random random = new Random();  //make a random variable
    
    public void init (LinkedList <Point> data, int k) {
        Point newCentroid, newpoint;
        Cluster newCluster;
        systemDistanceFromCentroids = Double.MAX_VALUE;
        System.out.println(k + "clusters will be created.");
        
        //for each cluster, make a point called "newCentroid", 
        //with random x and y within the bounds of the actual points (values), 
        //then make a new cluster with a centroid at newCentroid, add it to "clusters" array
        for (int i = 0; i < k; i++){
            newCentroid = new Point();
            newCentroid.x = random.nextDouble()*(values.maxXY.x - values.minXY.x) + values.minXY.x;
            newCentroid.y = random.nextDouble()*(values.maxXY.y - values.minXY.y) + values.minXY.y;
            newCluster = new Cluster();
            newCluster.setCentroid(newCentroid);
            clusters.add(newCluster);  //add newCluster to the arrayList of clusters
          //  newCluster.totalDistanceFromCentroids = Double.MAX_VALUE;
        }
    }
 
    public void assignPoints(){
        Point current;
        double minDistance, newDistance;
        EUDistance measureStyle = new EUDistance();
        systemDistanceFromCentroids = 0.0;
        LinkedList <Point> data;

        //for every point in "values", compare its distance to each centroid, and
        //assign it to cluster of whichever centroid is closest
        for (Point p: data) {
            minDistance = Double.MAX_VALUE;
            measureStyle.getDistance(point, clusters.?? ;
            //IF newDistance < minDistance , ASSIGN POINT TO THAT CLUSTER,
            //ALSO, newDistance+ = totalDistanceFromCentroids
        }
    }

    public double updateTotalDistance(){
        //for every cluster, energy+ = getEnergy()
        for (int i=1; i < k; i++) {
           systemDistanceFromCentroids += clusters.get(i).getTotalDistanceFromCentroid();       
        }
           return(systemDistanceFromCentroids);
    }

    public void clearClusters(){
        for (Cluster cluster : clusters) {
            cluster.resetPoints();
        }
    }
    public void run() {
        int counter = 0;    
        boolean done = false;
        double prevTotalDistance = Double.MAX_VALUE;
        while ((counter < maxIterations) & !done) {
            clearClusters();
            assignPoints();
            //updateClusters();
            updateTotalDistance();
            
            //if "entropy" shrank by less than StopAt, stop iterating.
            if((prevTotalDistance - systemDistanceFromCentroids) < StopAt) {
                done = true;
            } //end of while
        } //end of other while
        System.out.println("counter = "+counter+"; total energy = "+systemDistanceFromCentroids);
    }

    public void summary(){
        //write out all the points
        for (Point point : values.points) {
            System.out.println("Point: "+point.x+","+point.y);
        }
        //write out all the cluster centroids
        for (Cluster cluster : clusters) {
            System.out.println("Cluster centroid: "+cluster.centroid.x+","+cluster.centroid.y);
        }
        //write out system energy at end
        System.out.println("System energy: "+systemDistanceFromCentroids);
    }
}

