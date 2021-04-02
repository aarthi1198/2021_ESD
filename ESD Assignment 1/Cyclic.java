/* Java program to check if a number is cyclic or not */

class Cyclic{
    
	// Function to generate all cyclic permutations of a number
    static boolean isCyclic(long number)
    {
        // Count digits and check if all digits are same
        long num = number;
        int count = 0;
        int digit = (int)(num % 10);
        boolean allSame = true;
        while (num > 0) {
            count++;
            if (num % 10 != digit)
                allSame = false;
            num = num / 10;
        }
  
        // If all digits are same, then not considered cyclic.
        if (allSame == true)
            return false;
  
        // If the count of digits is even and two halves are same, then the number is not considered cyclic.
        if (count % 2 == 0) {
            long halfPower = (long)Math.pow(10, count / 2);
            long firstHalf = number % halfPower;
            long secondHalf = number / halfPower;
            if (firstHalf == secondHalf && isCyclic(firstHalf))
                return false;
        }
  
        num = number;
        while (true) {
            // To generate circular permutations of number.
            long rem = num % 10;
            long div = num / 10;
            num = (long)(Math.pow(10, count - 1)) * rem + div;
  
            // If all the permutations are checked and if original number is obtained, exit from loop.
            if (num == number)
                break;
  
            if (num % number != 0)
                return false;
        }
  
        return true;
    }
  
    // Driver code
    public static void main(String[] args)
    {
        long number = 142857;
        if (isCyclic(number))
            System.out.print(number + " is a cyclic number");
        else
            System.out.print(number + " is not a cyclic number");
    }
}
  