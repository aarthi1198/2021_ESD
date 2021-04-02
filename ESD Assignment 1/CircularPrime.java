/* Java program to check if a given number is circular prime or not */

class CircularPrime{
    static int i,l,div = 1,remainder,n = 1193, temp = n, rtn;
    public static void main(String args[])
    {
      for(i=1;i<l;i++)
      {
        div = div * 10;// to store multiple of 10, to divide
      }
        rtn = compute(n,l);
        rtn = ifprime(n);
    }
    public static int ifprime(int n)
    {
	  int count=0;
      
	  for(i=1;i<=n;i++)
      { 
	     if(n%i==0)
          count++;
      }
     if(count == 2)
      System.out.println(temp + " is a circular prime number");
      else
      System.out.println(temp + " is not a circular prime number");       
     return 0;
    }
    
	public static int compute(int num,int l)
    {
	  int i=0;
      while(i < l-1) 
      { 
	     remainder = n % 10;
         n = n / 10;
         n = (remainder * div) + n;
         System.out.println(n);
         i++;
      }
     return 0;
    }
}