/* Java program to find the hexadecimal equivalent for a given 4-digit binary number */

class Binary2Hexadecimal{
      public static void main (String args[])
      {
          int binaryval = 1111, decimalval = 0, i = 1, j = 0, remainder;
		  int hexadecimal[] = new int[1000];
          while (binaryval != 0)
          {
              remainder = binaryval % 10;
              decimalval = decimalval + remainder * i;
              i = i * 2;
              binaryval = binaryval / 10;
          }
		  i = 0;
		  while (decimalval != 0)
		  {
			  hexadecimal[i] = decimalval % 16;
			  decimalval = decimalval / 16;
			  i++;
		  }

          System.out.println("Hexadecimal value : ");
		  for (j = i - 1; j >= 0; j--)
		  {
			  if (hexadecimal[j] > 9)
			  {
				  System.out.println ((char)(hexadecimal[j] + 55));
			  }
			  else
			  {
				  System.out.println (hexadecimal[j]);
			  }
          }
	  }
}