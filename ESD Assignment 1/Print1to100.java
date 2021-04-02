/* Java program to print 1 to 100 without using numbers */

class Print1to100
{
    // Prints numbers from 1 to n
    static void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }
  
    // Driver Code
    public static void main(String[] args) 
    {
        printNos(100);
    }
}