import java.util.Scanner;

public class Uri_45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();


		if (a < b) {
			double t = a;
			a = b;
			b = t;
		}
		if (a < c) {
			double t = a;
			a = c;
			c = t;
		}
		if (b < b) {
			double t = b;
			b = c;
			c = t;
		}
		 if (a >= b + c) {
		 	System.out.println("NAO FORMA TRIANGULO");
		 } else {
		 	if (a * a == b * b + c * c) {
		 		System.out.println("TRIANGULO RETANGULO");
		 	} else if (a * a > b * b + c * c) {
		 		System.out.println("TRIANGULO OBTUSANGULO");
		 	} else if (a * a < b * b + c * c) {
		 		System.out.println("TRIANGULO ACUTANGULO");
		 	}
		 	if (a == b && b == c) {
		 		System.out.println("TRIANGULO EQUILATERO");
		 	} else if ((a == b && a != c) || (b == c && b !=a) || (a == c && a != b)) {
		 		System.out.println("TRIANGULO ISOSCELES");
		 	}
		 }
		
	}
}