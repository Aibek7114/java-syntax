import java.util.Scanner;

public class Uri_51 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double salary = scan.nextDouble();
		double tax = 0;
		double newsa = 0;

		if (salary >= 0 && salary <= 2000) {
			System.out.println("Isento");
		} else if (salary > 2000 && salary <=3000) {
			newsa = salary - 2000;
			tax = (newsa * 8) / 100;
			System.out.printf("R$ %.2f%n ", tax);
		} else if (salary >= 3000 && salary <= 4500){
			newsa = salary - 3000;
			tax = (newsa * 18) / 100;
			tax += (1000 * 8) / 100;
			System.out.printf("R$ %.2f%n ", tax);
		} else if (salary > 4500) {
			newsa = salary - 4500;
			tax = (newsa * 28) / 100;  // 4500
			tax += (1500 * 18) / 100;   // 3000
 			tax += (1000 * 8) / 100;   // 2000
			System.out.printf("R$ %.2f%n ", tax);
		}

	


	}
}