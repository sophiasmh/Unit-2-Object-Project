import java.util.Random; //this statement imports the random module/library

public class SpinnerTester {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int x = 7;
		x = generator.nextInt(21) + 10; // generates a random int between 10 and 30
		System.out.println("The value of x is: " + x);
	
		Random generator2 = new Random();
		int y = 7;
		y = generator2.nextInt(101); // generates a random int between 0 and 100
		System.out.println("The value of y is: " + y);
	
	}

}
