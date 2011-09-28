
public interface Player {
    
    String getID();
    int MakeMove();
    void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID);
    String toString();
}
