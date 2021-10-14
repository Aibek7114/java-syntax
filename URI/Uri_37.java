import java.util.Scanner;

public class Uri_37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double numer = scan.nextDouble();

		if (numer >= 0 && numer <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (numer > 25 && numer <=50) {
			System.out.println("Intervalo (25,50]");
		} else if (numer > 50 && numer <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (numer > 75 && numer <=100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

	}
	
}