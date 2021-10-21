import java.util.Scanner;

public class Uri_154 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n;
		int count = 0;
		double sum = 0;

		while (true) {
			n = scan.nextInt();
			if (n < 0) {
				break;
			} else {
				sum += n;
				count ++;
			}
		}
		System.out.printf("%.2f%n", sum / count);

	}
}