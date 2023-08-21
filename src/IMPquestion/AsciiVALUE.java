package IMPquestion;

public class AsciiVALUE {

	public static void main(String[] args) {
		// ASCII means American Standard Code for information interchange.
		
		// Print ASCII value with int Casting throught
		char c = 'Z';
		int b = c;
		int Casting = (int)b; //--> Casting used kel
		
		System.out.println(Casting);
		
		
		// Find String to ASCII value
		String scr = "ABCDEFGHI";
		
		char c1 =scr.charAt(2);
		
		System.out.println((int)c1); // --> Casting
		

		// find Compare method Same String sarkhi aa
		
		String a = "Rushika";
		String bb = "Sourabh";
		
		System.out.println(a.compareTo(bb)); // a>bb Positive value yeil , a<bb negative value yeil
		
		
		
			
		}
		
	}


