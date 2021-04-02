/*Java Program to print odd numbers between 0 and 100*/

class Odd
{
   public static void main(String args[])
       {
         int i;
         System.out.println("The odd numbers between 0 and 100 are:");
         for (i = 1; i < 100; i++)
          {
            if(i % 2 != 0)
             System.out.println(i);
          }
       }
}