/* Java program to print all prime factors of a given number */ 

import java.lang.Math; 
  
class PrimeFactor{ 
    // A function to print all prime factors of a given number n 
    
	public static void primeFactors(int n) 
    { 
        // Print the number of 2's that divide n 
        while (n % 2 == 0) { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
   
        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
            // While i divides n, print i and divide n 
            while (n % i == 0) { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
   
        // if n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 
    } 
  
    public static void main(String[] args) 
    { 
        int n = 396; 
        primeFactors(n); 
    } 
}