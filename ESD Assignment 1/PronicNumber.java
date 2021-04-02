/* Java program to check if a number is a Pronic / Heteromecic Number or not */

class PronicNumber{
    public static void main(String args[])
    {
        int ans = 0, num = 95;
    
        for(int i = 0; i < num; i++)
        {
            if(i*(i+1) == num) //if num is equal to the product of two consecutive integers, it is a Pronic Number 
            {
                ans = 1;
                break;
            }
        }
         
        if(ans == 1)
            System.out.println(num + " is a Pronic Number");
        else
            System.out.println(num + " is not a Pronic Number");      
    }
}