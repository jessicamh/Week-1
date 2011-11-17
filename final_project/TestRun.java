package agents;
import java.util.Random;
import risk.*;

/* @author Muse */
public class TestRun extends Agent{

    public TestRun(int id, int type){
        super(id, type);
        empireName = "TestRun";
    }

    public void attack(){
        myTerritory.produceSoldiers(myTerritory.getNatRes(), myTerritory.getPeasants());
        attackingSoldiers = myTerritory.getSoldiers();
        attackedTerritoryID = (new Random()).nextInt(myTerritory.getNeighbors().numObjs) + 1;
    }
}
