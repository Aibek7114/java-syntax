import java.util.Scanner;

public class Uri_153 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); //4
		int b = 2;

		if (n > 0 && n < 13) {
			for (int i = n; i >= 1; i--) { // 3,2,1
			b *= i;
		}
		}
		System.out.println(b);

	}
}