import java.util.Scanner;

public class Uri_151 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.print(a + " " + b);

		if (n > 0 && n < 46) {
			for (int i = 2; i < n; i++) {
			
			int c = a + b;			
			System.out.print(" " + c);

		    a = b;
			b = c;		
			}
		System.out.println();
		}
		
	}
}