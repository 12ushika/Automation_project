package String;

public class String1 {

	public static void main(String[] args) {
		
		String s1 = "Rushika"; // --> String Literal
		String s2 = new String("Rushika"); // --> String Object
		
		System.out.println(s1.equals(s2)); // .equals contend / value check karto write ahe ka
		
		System.out.println(s1==s2); // --> memory location vegle ahe te check karto
		
		
		System.out.println("------------------------------------------");
		
		
		String s5 = "Rushika"; 
		String s6 = new String("rushika"); 
		
		System.out.println(s5.equals(s6)); // --> contend same nahi ahe yat
		System.out.println(s5==s6); // --> yat pan memeroty location same nah ahe
		
		System.out.println("------------------------------------------");
		
		
		String s3 ="rushika";
		String s4 = "rushika";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
    
		System.out.println("------------------------------------------");


		
		String s8 = new String("rushika"); 
		String s7 = new String("rushika");
		
		System.out.println(s8.equals(s7));// --> contend compare kartoy
		System.out.println(s8==s7); // --> memory location check karto only string litral used hota
		
	}

}
