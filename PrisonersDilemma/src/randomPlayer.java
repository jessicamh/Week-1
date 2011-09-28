
import java.util.Random;

public class randomPlayer extends BasicPlayer {
        public int MakeMove() {
            Random r = new Random() ;
            //makes a random number
            if (r.nextFloat()>=0.5)
                return GameMove.DEFECT;
            else
                return GameMove.COOPERATE;
         }
}