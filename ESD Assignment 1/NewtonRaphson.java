/* Java program to find the square root of a number using newton raphson method */

import java.lang.Math;
class NewtonRaphson{
    public static void main(String args[])
    {
        double num = 328, x, l = 0.00001, root; //x is any assumed root of number num, root is the correct square root of num, l is the tolerance limit (maximum difference between x and root allowed)
		x = num; //assuming the value of x to be num
		int count = 0;
		
		while(true)
		{
		   count++;
		   root = 0.5 * (x + (num / x));
		   
		   if (Math.abs (root - x) < 1) //checking for closeness
		       break;
			   
			x = root; //Update root
		}
		
		System.out.println("The square root of " + num + " is " + root);
	}
}