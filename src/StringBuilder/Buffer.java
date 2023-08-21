package StringBuilder;

public class Buffer {

	public static void main(String[] args) 
	{
          StringBuffer abc = new StringBuffer("Sourabh");
          
          System.out.println(abc.append("shete"));
          
          System.out.println(abc.reverse());
          
          System.out.println(abc.delete(1, 3));
          
          System.out.println(abc.insert(7, "rushika"));

          System.out.println(abc.replace(1, 3, "rushika"));
	}

}
