package cluster;

//IF USING ALTERNATE READ-CSV METHOD: import au.com.bytecode.opencsv.CSVReader;
import java.util.ArrayList;
import java.io.*;

public class Data {

//declare arraylist of points called "points", 
//declare minXY and maxXY as points  
    ArrayList <Point> points;
    public Point maxXY = new Point();
    public Point minXY = new Point();
    
//method getData does all of the following:
    public void getData(String pathname) throws FileNotFoundException,
        IOException {
        
    //set min and max points to min and max, 
    //create empty newpoint, create empty string "values"
        minXY.setMax();
        maxXY.setMin();
        Point newpoint = new Point();
        String [] values;
 
    //while row is not null, read in each line from the csv into a string "row"
    //and split it up by comma separation
        BufferedReader r = new BufferedReader(new FileReader("RoundRobinRecord.csv"));
        String row = r.readLine();
        while (row != null) {
            values = row.split(",");
            
        //parse value in third spot into a double, call "xnew"; fourth spot as "ynew"
            double xnew = Double.parseDouble(values[2]);
            double ynew = Double.parseDouble(values[3]);
       
        //make point called newpoint, fill with xnew and ynew, add to "points" array
            newpoint = new Point();
            newpoint.x = xnew;
            newpoint.y = ynew;
            points.add(newpoint);

        //update max-min of array based on new point added
            maxXY.x = Math.max(maxXY.x, xnew);
            maxXY.y = Math.max(maxXY.y, ynew);
            minXY.x = Math.min(minXY.x, xnew);
            minXY.y = Math.min(minXY.y, ynew);
            } //end "while" loop
        
        r.close();      //close the csv
        
        /*  ALTERNATE METHOD FOR READING IN CSV:
        CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            //nextLine is array
           //if (xnew > maxXY.x) { maxXY.x = xnew;
           //if (ynew > maxXY.y) { maxXY.x = ynew;
            System.out.println(nextLine[0] +"," + nextLine[1] + "etc...");
        } */
        
    }//end of getData method

  //printData method: if "points" array has data in it, 
  //iteratively print every point in the array.

  public void printData(){
        if (points.size() > 0) {
            for (int i = 0; i < points.size(); i++) {
                points.get(i).print();
            }

           //also print array's max and min 
            System.out.println("Max point:");
            maxXY.print();
            System.out.println("Min point:");
            minXY.print();
        } //end of "if"
        
        //if array is empty, write "No points."
        else {
            System.out.println("No points.");
        } //end of "else"
  } //end of printData method
} //end of Data class