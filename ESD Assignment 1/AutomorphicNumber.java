/* Java program to check if a number is an Automorphic Number or not */

import java.lang.Math;
 
class AutomorphicNumber{
    public static void main(String args[])
	{
        int num = 7, i = 0, square = num * num;
        int temp = num;  //copying num
 
        //counting digits of num
        while(temp > 0){
            i++;
            temp /= 10;
        }
 
        int lastSquareDigits = (int) (square %(Math.pow(10,i)));
 
        if(num == lastSquareDigits)
            System.out.println(num + " is an Automorphic Number");
        else
            System.out.println(num + " is not an Automorphic Number");
    }
}