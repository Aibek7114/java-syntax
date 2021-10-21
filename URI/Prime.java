import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();

		for (int i = 0; i < tests; i++) {
			int number = scan.nextInt(); 

		/*int divisors = 0;
			for (int j = 1; j < number; j++) {
				if (number & j == 0) {
					divisors++;
				}
			} */
			System.out.println(number + (isPrime(number) ? " eh primo" : " nao eh primo"));
		}

	}

		public static boolean isPrime(int number) {
			int divisors = 0;
			for (int j = 1; j <= number; j++) {
				if (number % j == 0) {
					divisors++;
				}
			}
			return divisors == 2;
		}
	}
