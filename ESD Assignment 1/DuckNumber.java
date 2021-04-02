/* Java program to check if a number is a Duck Number or not */

class DuckNumber{
    public static void main(String args[])
    {
        int number = 8346, remainder, i = 0, temp = number;   
 
        while (number > 0)
        {
            remainder = number % 10; 
            if (remainder == 0)
                i++;
            number /= 10;
        }
 
        if(i > 0)
            System.out.println(temp + " is a Duck Number");
        else
            System.out.println(temp + " is not a Duck Number");
    }
}
