
public class PavlovPlayer extends BasicPlayer {
      public PavlovPlayer (){
        myID="Pavlov Player";
}
    int oppLastMove=GameMove.COOPERATE;
    int myLastMove=GameMove.COOPERATE;

    public int MakeMove() {
       if (oppLastMove==GameMove.COOPERATE
               and myLastMove == GameMove.COOPERATE)
       return GameMove.COOPERATE;
       else if (oppLastMove==GameMove.DEFECT
               and myLastMove == GameMove.DEFECT)
               return GameMove.COOPERATE;
               else GameMove.DEFECT;
    }
@Override
    public void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID) {
        oppLastMove = oppMove;
        myMove = myLastMove;
        super.setScore(myMove,oppMove,myScore,oppScore,oppID);
    }
} 