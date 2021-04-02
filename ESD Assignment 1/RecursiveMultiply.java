/* Java program to multiply two numbers using recursive multiplication */

class RecursiveMultiply{
    static int product(int x, int y)
	{
	      if (x < y)
		     return product(y, x); //swap the numbers if x is less than y
			 
		  else if (y != 0)
		     return (x + product(x, y - 1)); //iteratively calculate y times sum of x
			 
		  else
		     return 0; //return zero if any of the two numbers is zero
	}
	   
	public static void main (String args[])
	{
	      int x = 23, y = 54;
		  System.out.println("The product of " + x + " and " + y + " is " + product(x, y));
    }
}