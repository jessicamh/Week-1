import java.util.Scanner;

public class HumanPlayer extends BasicPlayer {
         public HumanPlayer(){
        myID="Human Player";
}
         public int MakeMove() {
            int move;
            //holding for human GameMove
            Scanner typeStuff = new Scanner (System.in);
            System.out.println("Pick your move! Type 0 to cooperate, 1 to defect.");
            move = typeStuff.nextInt();
            if (move ==  0)
                return GameMove.COOPERATE;
            else
                return GameMove.DEFECT;
         }
}