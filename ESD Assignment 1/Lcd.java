/* Java program to find the LCD of the given numbers */
// LCD (Least Common Denominator) is the Least Common Multiple (LCM) of the denominators of a set of fractions.

class Lcd{
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
              
        return gcd(b % a, a);
    }
      
    // function to calculate lcm of
    // two numbers.
    static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
      
    static void printSum(int num1, int den1, int num2, int den2)
    {
          
        // least common multiple of denominators
	    // (Eg:) Lcd of 6 and 15 is 30
        int lcd = lcm(den1, den2);
      
        // Computing the numerators for LCD:
        //(Eg:) Writing 1/6 as 5/30 and 7/15 as 14/30
        num1 *= (lcd / den1); 
        num2 *= (lcd / den2); 
      
        // sum is going to be res_num/lcd
        int res_num = num1 + num2;
		
		System.out.print("The LCD is " + res_num + "/" + lcd);
          
    }
          
    // Driver code
    public static void main(String args[]) 
    {
          
        // First fraction is 1/6
        int num1 = 1, den1 = 6; 
  
        // Second fraction is 7/15
        int num2 = 7, den2 = 15; 
		
		printSum(num1, den1, num2, den2);
  
    }
}
  
		