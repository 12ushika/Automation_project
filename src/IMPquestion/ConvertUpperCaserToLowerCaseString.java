package IMPquestion;

import java.util.Scanner;

public class ConvertUpperCaserToLowerCaseString {

	public static void main(String[] args) {
		
	//	3 way to find lower to upper
		
		// 1 way
		String a = "rushika";
		
		System.out.println(a.toUpperCase()); // --> output RUSHIKA
		
		
       // 2 way
		
		String b = "SOURABH";
		
		System.out.println(b.toLowerCase());
		
		
		// 3 way
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String scr = sc.nextLine();
		
		String s = "";
		char ch;
		
		for ( int i=0; i<scr.length(); i++) 
		{
			ch=scr.charAt(i);
			
			if(ch>=65 && ch<=90) //--> ASCII value logic chart bagne
			{
				s+=(char)(ch+32); //--> lower case convert
			}
			else if (ch>= 97 && ch<= 122) 
			{
				s+=(char)(ch-32); // --> upper case convertion
			}
			else 
			{
				s+=ch;
			}
		}
		System.out.println(s);
	}

}
