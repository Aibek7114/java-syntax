import java.util.Scanner;


public class Uri_64 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = 0;
		double sum = 0;
		int positiveCounter = 0;
		
		 while (x++ < 6) {
		 	double number = scan.nextDouble();

		 	if (number > 0) {
		 		positiveCounter++;
		 		sum += number;
		 	}
		 	
		 }
		 System.out.println(positiveCounter + " valores positivos");
		 System.out.printf("%.1f%n ", sum / positiveCounter);

	}
}