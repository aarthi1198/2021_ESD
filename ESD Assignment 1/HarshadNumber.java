/* Java program to check if a number is a Harshad Number or not */

class HarshadNumber{
    public static void main(String args[])
	{
	   int number = 152, remainder = 0, sum = 0, num;
       num = number; //Making a copy of number and storing it in variable num
       
	   //Calculating sum of digits
       while (number > 0){
        remainder = number % 10;
        sum += remainder;
        number /= 10;
       }

      //To check if the number is Harshad or not, (i.e) to check if it is divisible by sum of its digits
      if (num % sum == 0)
        System.out.println(num + " is a Harshad Number");
      else
	    System.out.println(num + " is not a Harshad Number");
	}
}
        	  