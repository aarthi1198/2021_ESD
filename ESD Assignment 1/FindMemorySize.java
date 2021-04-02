/* Java program to find the memory size in bytes given the input as address length */
// Size of memory = size of each address * number of addresses = 8 * 2^n

import java.util.Scanner;
class FindMemorySize{
    
	public static void main (String args[])
	{
	    Scanner scanner = new Scanner(System.in); 
        System.out.print("Address length n : ");
	    int n = scanner.nextInt();
		System.out.print("Memory size = 8 * 2^" + n + " bits = 2^" + n + " bytes");
	}
}