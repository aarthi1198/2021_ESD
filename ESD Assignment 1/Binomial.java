/* Java program to calculate the Binomial Coefficient of two positive numbers */

// formula : (n, k) = n! / k! (n - k)!

class Binomial{
    static long binomial_Coefficient(int n, int k)
    {
        if (k > n - k)
            k = n - k;
        
		long result = 1;
        for (int i = 1, m = n; i <= k; i++, m--)
            result = result * m / i;
        return result;
    }

    public static void main(String[] args)
    {   
       int n = 10, k = 2;
       if (n > 0 && k > 0)
	   {	
		 System.out.println("Binomial Coefficient of (" + n + ", " + k + ") is " + binomial_Coefficient(n, k));
	   }         
    }
} 