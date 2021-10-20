//package Examples;

public class CheckInputExamples {
	public static void main(String [] args) {
		//get int
		System.out.println("Enter a number: ");
		int num = CheckInput.getInt();
		
		//get double
		System.out.println("Enter a price: ");
		double price = CheckInput.getDouble();
		
		//get positive int
		System.out.println("Enter a quantity: ");
		int qty = CheckInput.getPositiveInt();
		
		//get int range
		System.out.println("Enter a number 1-10: ");
		int numInRange = CheckInput.getIntRange(1, 10);
		
		//get string
		System.out.println("Enter your name: ");
		String name = CheckInput.getString();
		
		//get bool
		System.out.println("Continue? (Y/N): ");
		boolean cont = CheckInput.getYesNo();
	}
}

