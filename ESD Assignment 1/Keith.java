/* Java program to check if a number is a keith number or not */

class Keith{
    public static void main(String[] args)
	{
       int num = 14, temp = num;
       String s = Integer.toString(num);
       int d = s.length();
       int arr[] = new int[num];
       int i, sum = 0; 
       
	   for(i = d - 1; i >= 0; i--)
       {
          arr[i] = temp % 10;
          temp /= 10;
       }
	   
	   i = d; 
       
	   while(sum < num)
       {
          sum = 0;
          for(int j = 1; j <= d; j++)
          {
             sum = sum + arr[i-j];
          }
          arr[i] = sum;
          i++;
       }
 
       if(sum == num)
        System.out.println(num + " is a Keith Number");
       else
        System.out.println(num + " is not a Keith Number");
    }
}