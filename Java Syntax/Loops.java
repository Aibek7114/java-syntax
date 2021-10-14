import java.util.Scanner;


public class Loops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int positiveCounter = 0;

		while (count < 6) {
			double number = scan.nextDouble();

			if (number > 0) {
				positiveCounter++;
			}
			count++;
		}
		System.out.println(positiveCounter + " valores positivos");
	}
}