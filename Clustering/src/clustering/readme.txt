This program now clusters points from a csv in this format:

Cooperate,Defect,3,0
Defect,Tit-for-tat,3,0

where the first two values represent strings and the latter two represent the points to be clustered.

It typically takes 1-7 iterations to find the best clusters. Run it several times to verify this.

To change the name of the input file, substitute another filename for "RoundRobinRecord2.csv" in Clustering.java, because that is the default.

To change the number of clusters the data will form, change "3" (the default) in Clustering.java to your preferred number.

The program presently runs on Euclidean distance to calculate clusters, but other distance calculations can be loaded in.

KNOWN BUG:
Sometimes one of the original randomly selected cluster centroids will not be closer to any point than the other centroids, and the program will ultimately find only two clusters. The third (nonexistent) centroid will be shown as "NaN, NaN".

