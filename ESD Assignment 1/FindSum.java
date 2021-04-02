/* Java program to find the number between 0 - 1000 where the sum is 8 */

class FindSum{ 
    static void findDigitSum(int n, int sum, char out[], int index) 
    { 
        if (index > n || sum < 0) 
            return; 
   
        // If number becomes n-digit 
        if (index == n) 
        { 
            // if sum of its digits is equal to given sum, 
            // print it 
            if(sum == 0) 
            { 
                out[index] = '\0'   ; 
                System.out.print(out); 
                System.out.print(" "); 
            } 
            return; 
        } 
   
        // Traversing through every digit 
        // considering leading 0's as digits 
        for (int i = 0; i <= 9; i++) 
        { 
            // append current digit to number 
            out[index] = (char)(i + '0'); 
   
            // recurse for next digit with reduced sum 
            findDigitSum(n, sum - i, out, index + 1); 
        } 
    } 
      
    static void findNDigitNums(int n, int sum) 
    { 
        // output array to store n-digit numbers 
        char[] out = new char[n + 1]; 
   
        // fill 1st position by every digit from 1 to 9 and 
        // calls findDigitSum() for remaining positions 
        for (int i = 1; i <= 9; i++) 
        { 
            out[0] = (char)(i + '0'); 
            findDigitSum(n, sum - i, out, 1); 
        } 
    } 
      
    // driver program to test above function 
    public static void main (String[] args)  
    { 
             int n1 = 1, n2 = 2, n3 = 3, sum = 8; 
             findNDigitNums(n1, sum); 
			 findNDigitNums(n2, sum);
			 findNDigitNums(n3, sum);
    } 
} 
  