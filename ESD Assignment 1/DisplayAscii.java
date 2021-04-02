/* Java program to print the ASCII values of a-z, A-Z, 0-9 */

class DisplayAscii{
    public static void main(String args[])
	{
	   char ch1 = 'a', ch2 = 'A', ch3 = '0';
	   int asciivalue1, asciivalue2, asciivalue3;
	   
	   for (ch1 = 'a'; ch1 <= 'z'; ch1++)
       {
          asciivalue1 = ch1;
		  System.out.println("The ASCII value of " + ch1 + " is " + asciivalue1);
       }
	   
	   for (ch2 = 'A'; ch2 <= 'Z'; ch2++)
       {
          asciivalue2 = ch2;
		  System.out.println("The ASCII value of " + ch2 + " is " + asciivalue2);
       }
	   
	   for (ch3 = '0'; ch3 <= '9'; ch3++)
       {
          asciivalue3 = ch3;
		  System.out.println("The ASCII value of " + ch3 + " is " + asciivalue3);
       }
    }
}	