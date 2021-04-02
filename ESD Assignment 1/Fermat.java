/* Java program to display first 10 Fermat numbers */

import java.lang.Math;
class Fermat{
    public static void main(String args[])
	{ 
        int num = 0;        
        double result;
		System.out.println("The first 10 Fermat numbers:");
        
        while (num <= 10){
            result = Math.pow (2, Math.pow(2, num)) + 1;
            num++;
            System.out.println(result);
        }
    }  
}