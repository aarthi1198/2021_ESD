// If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu, Charu is how many years younger than Iqbal? 
// Generalize this program and provide a JAVA program to get input and find the age

import java.util.*;
class Age{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
	   System.out.print("The total ages of Iqbal and Shikhar is greater than the total age of Shikhar and Charu by : ");
       int a = sc.nextInt();
	   int x, y, z, count = 0; // x, y and z are ages of Iqbal, Shikhar and Charu respectively
	   for (x = 1; x <= a; x++)
	   {
		   for (y = 1; y <= a; y++)
	       {
              for (z = 1; z <= a; z++)
			  {
				 if ((x + y) - (y + z) == a) 
			      count++;
	          }
	       }
		  
	   }
	   
	   if (count == 0)
		   System.out.println("Charu is " + a + " years younger than Iqbal");
	   
	}
}