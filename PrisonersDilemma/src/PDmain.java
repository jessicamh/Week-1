import java.util.ArrayList;
import java.io.*;

public class PDmain {
    
    ArrayList<Player> players = new ArrayList<Player>();
    public void setupTournament() {
        players.add(new HumanPlayer());
        players.add(new CoopPlayer());
        players.add(new DefectPlayer()); 
        players.add(new randomPlayer()); 
        players.add(new TFTPlayer()); 
        players.add(new TFTPessPlayer()); 
    }

public void roundRobin() throws IOException {
    FileWriter makeTxt = new FileWriter("RoundRobinRecord.csv");
    PrintWriter outputFile = new PrintWriter(makeTxt);

    Judge MrJudge = new Judge();
     for (Player p1: players) {
         for (Player p2: players) {
             if (p1==p2) continue;
             p2.resetScore();
             p1.resetScore();
             System.out.println("Playing:"+p1.getID()+" vs "+p2.getID());
             MrJudge.playMatch(p1,p2,10);
             outputFile.println(p1.getID() + "," + p2.getID() + "," + p1.getScore() + "," + p2.getScore());
         }
     }  
     outputFile.close();
    }

public void printResults() {
    System.out.println("Results:");
    for (Player p : players) {
        System.out.println(p.toString());
    }
}
    
public static void main (String[] args) 
throws IOException {
    PDmain game = new PDmain();
    game.setupTournament();
    game.roundRobin();
    game.printResults();
}    



}