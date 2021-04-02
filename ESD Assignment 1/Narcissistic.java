/* Java program to find all the narcissistic numbers between 1 and 1000 */

import java.lang.Math;
class Narcissistic
{
   //function to count the number of digits
   int countDigit(int num)
   {
      if (num == 0)
        return 0;
  
      return 1 + countDigit(num / 10);
   }
  
   //Returns true if num is a Narcissistic number
   boolean check(int num)
   {
      int l = countDigit(num);
      int temp = num, sum = 0;
  
      //calculates the sum of digits raised to power
      
	  while(temp > 0) 
      {
         sum += Math.pow(temp % 10, l);
         temp /= 10;
      }
  
      return (num == sum);
   }
  
   //Driver code
   public static void main(String args[])
   {
      Narcissistic obj = new Narcissistic();
      System.out.println("Narcissistic numbers between 1 and 1000:");
	  for (int i = 1; i < 1000; i++)
	  {
         if(obj.check(i))
           System.out.println(i);
      }
   }
}
 
