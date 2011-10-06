public class CoopPlayer extends BasicPlayer {
        public CoopPlayer(){
        myID="Coop Player";
}
        public int MakeMove() {
                return GameMove.COOPERATE;
         }
}