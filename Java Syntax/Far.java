import java.util.Scanner;
  public class Far {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int farenheit = scan.nextInt();
		int something = 32;
		double degreeInCelsius = (farenheit - (double)something) * 5 / 9;

		System.out.printf("%d farenheit = %.4f celsius%n", farenheit, degreeInCelsius);

	}
}



