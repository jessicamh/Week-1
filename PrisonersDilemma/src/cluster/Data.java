
package cluster;

//import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;

public class Data {
    ArrayList <Point> points;
    public Point maxXY;
    
    public void getData(String pathname) throws FileNotFoundException,
     IOException { //...read in stuff?
       
        maxXY.x = 0;
        maxXY.y = 0;
        
        CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            //nextLine is array
           //if (xnew > maxXY.x) { maxXY.x = xnew;
           //if (ynew > maxXY.y) { maxXY.x = ynew;
            System.out.println(nextLine[0] +"," + nextLine[1] + "etc...");
        }
    }
}
