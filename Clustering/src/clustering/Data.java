package clustering;

/* @author Muse */

import java.util.ArrayList;
import java.io.*;

public class Data {
    ArrayList <Point> points = new ArrayList();
    public Point maxXY = new Point();
    public Point minXY = new Point();
    
    public void getData(String pathname) {
        Point newpoint;
        double xnew, ynew;
        String [] values;
        minXY.setMax();
        maxXY.setMin();        
        try {
            BufferedReader r = new BufferedReader(new FileReader("RoundRobinRecord2.csv"));
            String row = r.readLine();
            while (row != null) {
                values = row.split(",");                
                row = r.readLine();
                
                newpoint = new Point();
                xnew = Double.parseDouble(values[2]);
                ynew = Double.parseDouble(values[3]);
                newpoint.x = xnew;
                newpoint.y = ynew;

                points.add(newpoint);
                
                maxXY.x = Math.max(maxXY.x, xnew);
                maxXY.y = Math.max(maxXY.y, ynew);
                minXY.x = Math.min(minXY.x, xnew);
                minXY.y = Math.min(minXY.y, ynew);
                //System.out.println(values[2] + "," + values[3]);

            } 
            r.close(); 
            System.out.println("Read "+points.size()+" points.");
            //System.out.println(minXY.x+","+minXY.y);
            //System.out.println(maxXY.x+","+maxXY.y);
        }
        catch (IOException ex) {
            System.out.println("ERROR -- File not found");
        }
    }

public void printData(){
        if (points.size() > 0) {
          /*  for (int i = 0; i < points.size(); i++) {
                points.get(i).print();
            } */

            System.out.println("Max point:");
            maxXY.print();
            System.out.println("Min point:");
            minXY.print();
        }
        
        else {
            System.out.println("No points.");
        } 
  } 
} 
