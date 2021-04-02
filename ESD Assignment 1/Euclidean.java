/* Java program to find the Euclidean distance between two points */

import java.lang.Math;
class Euclidean{

    public static void main (String[] args)
    {
       int x1 = 3, y1 = 4, x2 = 4, y2 = 3;
	   double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //formula to find the Euclidean distance based on Pythagorean theorem
	   System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + Math.round(distance*100000.0)/100000.0); //to round off the distance to 5 decimal places
    }
}
 