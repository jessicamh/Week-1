
public interface Player {
    
    String getID();
    void resetScore();
    int getScore();
    int MakeMove();
    void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID);
    String toString();
}
