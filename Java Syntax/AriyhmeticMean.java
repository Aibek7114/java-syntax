import java.util.Scanner;


public class AriyhmeticMean {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int  sum = 0;
		int counter = 0;

		int number;

		do {
			number = scan.nextInt();

			counter++;
			sum += number;
		} while(number != 0);
		System.out.println(sum / counter - 1);
	
	}
}