import java.util.Scanner;

public class Uri_48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double salary = scan.nextDouble();
		double increase = 0;
		int percentage = 0;

		if (salary >= 0 && salary <= 400) {
			percentage = 15;
			increase = ((salary * 15) / 100.0);
		} else if (salary > 400.0 && salary <= 800) {
			percentage = 12;
			increase = (salary * 12) / 100.0;
		} else if (salary > 800.0 && salary <= 1200) {
			percentage = 10;
			increase = (salary * 10) / 100.0;
		} else if (salary > 1200.0 && salary <= 2000) {
			percentage = 7;
			increase = (salary * 7) / 100.0;
		} else if (salary > 2000.0){
			percentage = 4;
			increase = (salary * 4) / 100.0;
		}

		System.out.printf("Novo salario: %.2f%n", salary + increase);
		System.out.printf("Reajuste ganho: %.2f%n", increase);
		System.out.println("Em percentual: " + percentage + " %");
	}
}