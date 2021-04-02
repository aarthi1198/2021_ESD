/* Java program to check if two numbers are Amicable or not */

public class Amicable{
     public static void main(String args[]) 
	 {
            int num1 = 1184, num2 = 1210, sum_num1 = 0, sum_num2 = 0, temp1 = num1, temp2 = num2;
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    sum_num1 += i;
            }
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0)
                    sum_num2 += i;
            }
            if (sum_num1 == sum_num2)
                System.out.println(temp1 + " and " + temp2 + " are amicable numbers");
            else
                System.out.println(temp1 + " and " + temp2 + " are not amicable numbers");			
     }
}