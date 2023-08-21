package IMPquestion;

import java.util.Scanner;

public class get_last_letter_of_each_word_in_String {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Word");
		String str = sc.nextLine().trim(); //--> White space kadnya sathi
		
		String word = " ";
		str = str +" ";
		
		for( int i=0; i<str.length(); i++) 
		{
			char ch =str.charAt(i);
			if(Character.isWhitespace(ch)) 
			{
				System.out.println(word.charAt(word.length()-1));
				word =" ";
				
				
			}
			else 
			{
				word = word + ch;
			}
		}

	}

}
