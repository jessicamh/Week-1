import java.util.ArrayList;

public class Main {
    
    ArrayList<Player> players;
    public void setupTournament() {
        players = new ArrayList<Player>();
        players.add(new CoopPlayer());
        players.add(new DefectPlayer()); 
        players.add(new randomPlayer()); 
        players.add(new TFTPlayer()); 
        players.add(new TFTPessPlayer()); 
    }

public void roundRobin() {
     Judge MrJudge = new Judge();
     for (Player p1: players) {
         for (Player p2: players) {
             if (p1==p2) continue;
             MrJudge.playMatch(p1,p2,10);
         }
     }   
    }

public void printResults() {
    System.out.println("Results:");
    for (Player p : players) {
        System.out.println(p.toString());
    }
}
    
public static void main (String[] args) {
    Main game = new Main();
    game.setupTournament();
    game.roundRobin();
    game.printResults();
}    
}
