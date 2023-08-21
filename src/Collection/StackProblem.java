package Collection;
import java.util.Stack;

public class StackProblem {

	public static void main(String[] args) {

		
		Stack<Integer> str = new Stack<>();
		str.push(10);
		str.push(20); //--> Inserting data
		str.push(20);
		str.push(40);
		
		System.out.println(str.pop());
		System.out.println(str.pop()); // --> Fetching data used means kadnya sathi
		System.out.println(str.pop());
		System.out.println(str.pop());
	}

}
