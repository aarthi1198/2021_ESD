/* Java program to find the max and min of given two numbers */

class MaxandMin{
    public static void main(String args[])
    {
       double num1 = 30.53, num2 = 30.56, min, max;
	   
	   if (num1 - num2 > 0)
	   {
	      max = num1;
		  min = num2;
	   }
	   
	   else
	   {
	      max = num2;
		  min = num1;
	   }
	   
	   System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max);
	   System.out.println("The minimum of " + num1 + " and " + num2 + " is " + min);
	}
}
	   
	     
       	   