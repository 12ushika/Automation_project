package IMPquestion;

public class StringReverse {

	public static void main(String[] args) {
		// How to Reverse a String in Java

		// 4 way to used reverse String name and word
		//1) Convert String into Char Array and used for loop
		//2) For loop with chat Act method
		//3) Using String Buffer and String Builder Class
		
		
		// 1 way  & 2 way both are same
		String name = "Rushika";
		
		char [] abc = name.toCharArray(); // char kadaychchay mahnun char ghetla
		int length = abc.length;
		
		System.out.println(length);
		
		for (int i=length-1; i>=0; i--) // -1 index 0 to 6 ahe name sathi mahnun
		{
			System.out.println(abc[i]);
		}
		
		System.out.println("===========================================================================");
		
		// 3 way 
		
		String name1 = "Sourabh";
		
		StringBuffer xyz = new StringBuffer("Sourabh");
		System.out.println(xyz.reverse());
		
		
		
		System.out.println("===========================================================================");
		// 4 ways
		
		StringBuilder build = new StringBuilder("Sourabh");
		System.out.println(build.reverse());
	}

}
