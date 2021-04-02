/* Java program to check if a number is a cube or not */

import java.lang.Math;
class Cube{
    public static void main(String args[])
	{  
       int num = 8;
	   int n = (int) Math.round(Math.pow(num, 1.0/3.0));
       if((num == n * n * n))
	   {
		   System.out.println(num + " is a cube number");
       }
	   else
	   {
		   System.out.println(num + " is not a cube number");
       }
    }
}