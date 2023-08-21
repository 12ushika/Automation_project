package IMPquestion;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		// Simple program..
		
		// Array 134567 find karne yatun
		
		// 1 step 1 to 7 chi (+) karne == 28
		// 2 step 134567 chi total karne ==26
		
		int a[] = {1,3,4,5,6,7};
		
		int b = a.length+1;
		int c = b*(b+1)/2;
		
 		int sum = 0;
		
		for (int i=0; i<a.length; i++) 
		{
			sum = sum+a[i];
		}
		System.out.println(c-sum);
		
		
		// 2 WAy is XOR way explanation deepak java sir mathun bagne
		
		
		int aa[] = {1,2,3,4,6,7,8,9};
		
		int XOR = aa[0];
		
		for(int i=1; i<aa.length; i++) 
		{
			XOR = XOR^aa[i];
		}
		
		int XOR1 = 1;
		
		for (int i=2; i<(aa.length+1); i++) 
		{
			XOR1 = XOR1^i;
		}
		System.out.println(XOR  ^ XOR1);

	}

}
