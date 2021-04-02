/* Java program to count the repeated occurrence of a digit in a n-digit number */

import java.util.*;
  
class DigitOccurrence
{
  
// Function to count the occurrences
// of the digit d in number n
static int countOccurrences(int n, int d)
{
    int count = 0;
  
    // Loop to find the digits of n
    while (n > 0) 
    {
  
        // check if the digit is d
        count = (n % 10 == d) ? 
                    count + 1 : count;
        n = n / 10;
    }
  
    // return the count of the
    // occurrences of d in n
    return count;
}
  
// Driver code
public static void main(String args[])
{
    int d = 0;
    int n = 1020304037;
  
    System.out.println("The number of occurrences of digit " + d + " in " + n + " is " + countOccurrences(n, d));
}
}
  