package IMPquestion;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		// reverse each word of String
		// using Split  with the help of for loop
		
		String abc = "my name is rushika";         // creat variable 
		
		String [] arr = abc.split(" ");          // split method used karne  Space Denya sathi used OR [,]
		String xyz = "";                         // empty variable creat karne
		
		for (int i=arr.length-1; i>=0; i--)    // for loop mathe length kadne and -1 ka aa aaray allowd stared 0 index
		{
			xyz = xyz + arr[i]+"";
		}
		System.out.println(xyz);

	}

}