package clustering;

/**
 *
 * @author Muse
 */
public class Clustering {

    public static void main(String[] args) {
        Data input=new Data();
        input.getData("RoundRobinRecord2.csv");
        input.printData();
        Kmeans kmeans = new Kmeans();
        kmeans.init(input, 3);
        kmeans.run();
        kmeans.summary();
    }
}