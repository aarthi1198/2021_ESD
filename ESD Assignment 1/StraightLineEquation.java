/* Java program to find the straight line equation giving input m and c */
// The equation for a line is y = mx + c
// m = slope = dy / dx = (y2 - y1) / (x2 - x1)
// c = intercept = y1 - (slope * x1) = y2 - (slope * x2)

import java.util.Scanner;
class StraightLineEquation{
    
	public static void main (String args[])
	{
       Scanner scanner = new Scanner(System.in); 
       System.out.print("Slope m : ");
	   double slope = scanner.nextDouble();
	   System.out.print("Intercept c : ");
	   double intercept = scanner.nextDouble();
	   System.out.println("The straight line equation is y = " + slope + "x + " + intercept);
	 }

}

