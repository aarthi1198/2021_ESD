// Java program to check whether there is any occurrence of characters in a n-digit input number 

class CharacterOccurrence
{
	private static int countOccurrences(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ch) {
				counter++;
			}
		}

		return counter;
	}

	public static void main(String[] args)
	{
		String str = "1234D6A8AD";
		char ch = 'D';

		System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times in " + str);
	}
}
