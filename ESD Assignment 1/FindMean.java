/* Java program to find the mean of given 5 numbers */

class FindMean{
    public static void main(String args[])
	{
	   int sum = 0; 
	   float mean;
	   int num[];
	   num = new int[] {12, 27, 35, 57, 78}; //Initializing an array of 5 elements
	   
	   for (int i = 0; i <= 4; i++)
	   {
	      sum += num[i];
	   }
	   
	   mean = (float) sum / 5;
	   System.out.println("Mean of the 5 numbers = " + mean);
	}
}	
	   