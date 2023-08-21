package String;

public class Compare {  // ASCII value compare hote nehmi

	public static void main(String[] args) {
		
		String name1 = "tony";
		String name2 = "tony";
		
		System.out.println(name1.compareTo(name2));
		
		System.out.println("---------------------------");
		
		
		String name3 = "Tony";
		String name4 = "tony";
		
		System.out.println(name4.compareTo(name3));
		
        System.out.println("---------------------------");
		
		
		String name5 = "tony";
		String name6 = "Tony";
		
		System.out.println(name6.compareTo(name5));


	}

}
