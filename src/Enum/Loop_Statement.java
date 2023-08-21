package Enum;

enum LEVEL
{
    LOW,
	MEDIUM,
	HIGH,
}

public class Loop_Statement {

	public static void main(String[] args) {
		
		LEVEL rushika = LEVEL.value();
		
		for (LEVEL rushika = LEVEL.value()) 
		{
			System.out.println(rushika);
		}

	}

}
