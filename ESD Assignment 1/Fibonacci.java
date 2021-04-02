/* Java program to check if a given number is Fibonacci or not */

import java.lang.Math;

class Fibonacci{

    // A method that returns true if x is perfect square 
    static boolean isPerfectSquare(int x) 
    { 
        int s = (int) Math.sqrt(x); 
        return (s*s == x); 
    } 
       
    // Returns true if n is a Fibonacci Number, else false 
    static boolean isFibonacci(int n) 
    { 
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both is a perfect square 
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4); 
    } 
  
    // Driver method  
    public static void main(String[] args) 
    { 
             int i = 41, j = 34;
			 System.out.println(isFibonacci(i) ?  i +  " is a Fibonacci Number" : i + " is not a Fibonacci Number"); 
			 System.out.println(isFibonacci(j) ?  j +  " is a Fibonacci Number" : j + " is not a Fibonacci Number"); 
    } 
} 
