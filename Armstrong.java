/*Java Program to check if a number is Armstrong or not*/

class Armstrong
{
   public static void main(String args[])
   {
       int num = 371, originalNum, result = 0, remainder;
       originalNum = num;
       while(originalNum != 0)
       {
         remainder = originalNum % 10;
         result += remainder * remainder * remainder;
         originalNum /= 10;
       }  
      
       if(result == num)
             System.out.println("yes");
       else
             System.out.println("no");
   }
}