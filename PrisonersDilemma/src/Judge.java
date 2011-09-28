public class Judge {
    public Judge() {} 
    
public void playMatch (Player p1, Player p2, int rounds) {
        for (int i=0;i< rounds ;i++)
            //starting with 0, i++ means i=i+1
        {playRound(p1,p2);  }
    }

public void playRound(Player p1, Player p2) {
    int m1=p1.MakeMove();
    int m2=p2.MakeMove();
    if (m1==0 && m2==0) {
        p1.setScore(m1, m2, 1, 1,p2.getID());
        p2.setScore(m2, m1, 1, 1,p1.getID()); }
    else if (m1==0 && m2==1) {
        p1.setScore(m1, m2, 5, 0,p2.getID());
        p2.setScore(m2, m1, 0, 5,p1.getID()); }
    else if (m1==1 && m2==0) {
        p1.setScore(m1, m2, 0, 5,p2.getID());
        p2.setScore(m2, m1, 5, 0,p1.getID()); }
   else if (m1==1 && m2==1) {
        p1.setScore(m1, m2, 3, 3,p2.getID());
        p2.setScore(m2, m1, 3, 3,p1.getID()); }
   }
}
