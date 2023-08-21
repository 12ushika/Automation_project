package Loops;

public class Febinacci_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// febinooci seies for interview queation
		int i = 1, n = 100, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.println(firstTerm + " ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }

	}

}
