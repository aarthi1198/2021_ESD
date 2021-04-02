/* Java program to check if a given number is palindrome or not */

class Palindrome{  
    public static void main(String args[])
    {  
       int rem,sum = 0,temp;    
       int num = 459; //number to be checked for the condition of palindrome  
	   temp = num;    //assigning the number to a temporary variable
       
	   while(num > 0)
	   {    
         rem = num % 10;  //getting remainder  
         sum = (sum * 10) + rem;    
         num = num / 10;    
       }
	   
       if(temp == sum)    
        System.out.println(temp + " is a palindrome number");    
       else    
        System.out.println(temp + " is not a palindrome number");    
    }  
}  