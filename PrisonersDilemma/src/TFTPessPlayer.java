
public class TFTPessPlayer extends BasicPlayer {
        public TFTPessPlayer(){
        myID="TFTPess Player";
}
    int oppLastMove=GameMove.DEFECT;

    public int MakeMove() {
       if (oppLastMove==GameMove.COOPERATE)
               return GameMove.COOPERATE;
       else
               return GameMove.DEFECT;
    }
@Override  // this is sort of optional, but basically it says to use this instead of what's inherited
    public void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID) {
        oppLastMove = oppMove;
        super.setScore(myMove,oppMove,myScore,oppScore,oppID);
    }
} 