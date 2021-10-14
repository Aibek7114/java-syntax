import java.util.Scanner;

public class Uri_36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a == 0 || ((b * b) - (4 * a * c)) < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%n", (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
			System.out.printf("R2 = %.5f%n", (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
		}

	}
}


