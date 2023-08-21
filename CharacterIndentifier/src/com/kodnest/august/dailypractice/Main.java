package com.kodnest.august.dailypractice;


public class Main {
	

		public static void identifyCharacter(char ch)

		{
			if(Character.isLetter(ch))
			{
				char character=ch;
				if(character=='a' ||character=='e' ||character=='i' ||character=='o' ||character=='u')
				{
					
					if(Character.isUpperCase(ch))
						{
							System.out.println("Upper-case vowel");
						}
					
					else
					{
						System.out.println("Lower-case vowel");
					}
				}
				else
				{
					if(Character.isUpperCase(ch))
					{
						
						System.out.println("Upper-Case consonant");
					}
					else
					{
						System.out.println("Lower-case consonant");
					}
				}
			}	
			else if(Character.isDigit(ch))
			{
				System.out.println("Digit");
			}
			else
			{
				System.out.println("Special Character");
			}

			
		// your code here

		}

		public static void main(String[] args)

		{
			

		identifyCharacter('a');

		}

}
