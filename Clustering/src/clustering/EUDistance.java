package clustering;

/* @author Muse */
public class EUDistance implements Distance {

    @Override
    public double getDistance(Point A, Point B){
       return (Math.sqrt ( Math.pow(A.x - B.x,2) + Math.pow(A.y - B.y,2) ));
}
}
