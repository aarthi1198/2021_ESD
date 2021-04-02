/*Java Program to check if a number is Armstrong or not*/

class Armstrong
{
   public static void main(String args[])
   {
       int num = 370, originalNum, result = 0, remainder;
       originalNum = num;
       while(originalNum != 0)
       {
         remainder = originalNum % 10;
         result += remainder * remainder * remainder;
         originalNum /= 10;
       }  
      
       if(result == num)
             System.out.println(num + " is an Armstrong number");
       else
             System.out.println(num + " is not an Armstrong number");
   }
}