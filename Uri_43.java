import java.util.Scanner;

public class Uri_43 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if ((a < b + c) && (b < (a + c)) && (c < (b + a))) {
			System.out.printf("Perimetro = %.1f%n", (a + b + c));
		} else {
			System.out.printf("Area = %.1f%n", (a + b) / 2 * c);
		}
	}
}
