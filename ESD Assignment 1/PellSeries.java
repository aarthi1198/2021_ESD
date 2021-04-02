/* Java program to print the first 15 numbers of the Pell series */

class PellSeries{
    public static void main(String args[])
    {
	   int num, a = 1, b = 0, c;
       System.out.println("First 15 Pell numbers: ");
       for(num = 1; num <= 15; num++)
       {
         c = a + (2 * b);
         System.out.print(c + " ");
         a = b;
         b = c;
       }
   }
}