import java.util.Scanner;


public class number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		System.out.print("Number of test: ");
		int testsCount = scan.nextInt();

		for (int i=0; i < testsCount; i++);
			int x = rnd.nextInt(10);
			int y = rnd.nextInt(10);

			int correctAnswer = x + y;

			while (true) {
				System.out.printf("%d + %d = ? Answer: ", x, y);
			    int answer = scan.nextInt();

			    if (answer == correctAnswer) {
			    	break;
			    }
			} 
				System.out.println("Incorrect! Try again...");
				numberOfIncorrects++;
			



	}
}