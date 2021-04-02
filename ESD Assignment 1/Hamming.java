/* Java program to create the first twenty hamming numbers */

class Hamming{

    //This function divides a by greatest divisible power of b
	static int maxDivide(int a, int b) 
    {
        while (a % b == 0)
            a = a / b;
        return a;
    }
 
    //Function to check if a number is hamming or not 
    static int ishamming(int num)
    {
        num = maxDivide(num, 2);
        num = maxDivide(num, 3);
        num = maxDivide(num, 5);
 
        return (num == 1) ? 1 : 0;
    }
 
    //Function to get the first twenty hamming numbers
    static int gethamming(int num)
    {
        int i = 1;
 
        // hamming number count
        int count = 1;
 
        // check for all integers until count becomes num
        while (num > count) {
            i++;
            if (ishamming(i) == 1)
                count++;
        }
        return i;
    }
 
    /* Driver Code*/
    public static void main(String args[])
    {
        System.out.println("First twenty Hamming numbers:");
		for (int i = 1; i <= 20; i++)
		{
		   int num = gethamming(i);
		   System.out.println(num);
		}
		
    }
}
 