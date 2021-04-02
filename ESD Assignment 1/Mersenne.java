/* Java program to check if a number is Mersenne number or not */

import java.lang.Math;
class Mersenne{   
    public static void main(String args[])
    {
        int num = 127, num1 = num + 1, power = 0, ans = 0;
        for(int i = 0; ; i++)
        {
            power = (int)Math.pow(2,i);
            if(power > num1)
            {
                break;
            }
            else if(power == num1)
            {
               System.out.println(num + " is a Mersenne number");
               ans=1;
            }
        }
		
        if(ans == 0)
        {
               System.out.println(num + " is not a Mersenne number");
        }
    }
}
