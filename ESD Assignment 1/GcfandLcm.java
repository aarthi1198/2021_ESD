/* Java program to find the GCF and LCM of given numbers */

class GcfandLcm{
    public static void main(String args[])
	{
	   int num1 = 60, num2 = 217, temp, temp1, temp2, gcf, lcm;
	   temp1 = num1;
	   temp2 = num2;
	   
	   while (temp2 != 0)
	   {
	      temp = temp2;
		  temp2 = temp1 % temp2;
		  temp1 = temp;
	   }
	   
	   gcf = temp1;
	   lcm = (num1 * num2) / gcf;
	   
	   System.out.println("The GCF of " + num1 + " and " + num2 + " is " + gcf);
	   System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
	}
}