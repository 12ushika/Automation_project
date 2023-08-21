package IMPquestion;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		// Find Second Largest Number in an Array in Java 
		// yat 8 cha adhi cha number print karto
		int[] a = {1,5,8,6,2,3,7};
		
		int temp;
		
		for(int i=0; i<a.length; i++) 
		{
			for (int j=i+1; j<a.length; j++) 
			{
				if(a[i] < a[j]) 
				{
					temp=a[i]; //--> Larest number findout karaych asel tar Desending Order mathe num gheyche
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==3) 
			{
				break;  //--> particular jo element pahije aa to milto sagl sort chi garaj nahi padat
			}
			
		}
		System.out.println(a[1]);
		
		
		
		// 2 way find second Smallest number in aaray
	
		
int[] ab = {1,2,3,4,5};
		
		int temps;
		
		for(int i=0; i<ab.length; i++) 
		{
			for (int j=i+1; j<ab.length; j++) 
			{
				if(ab[i] > ab[j]) 
				{
					temps=ab[i]; //--> Larest number findout karaych asel tar Assending Order mathe num gheyche
					ab[i]=ab[j];
					ab[j]=temps;
				}
			}
			if(i==1) 
			{
				break;  //--> particular jo element pahije aa to milto sagl sort chi garaj nahi padat
			}
			
		}
		System.out.println(ab[1]);
		

	}

}
