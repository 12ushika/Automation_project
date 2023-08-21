package Enum;

enum LEVEL
{
	LOW,
	MEDIUM,
	HIGH,
}

public class Switch_Statement {

	public static void main(String[] args) {
		
		LEVEL rushika =	LEVEL.HIGH;
		
		switch(rushika) 
		{
		case LOW:
		{
			System.out.println("Low level");
			break;
		}
		case MEDIUM:
		{
			System.out.println("MEDIUM level");
			break;
		}
		case HIGH:
		{
			System.out.println("HIGH level");
			break;
		}
		}

	}

}
