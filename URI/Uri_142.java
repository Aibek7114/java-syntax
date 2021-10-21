import java.util.Scanner;

public class Uri_142 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = 0;
		for  (int i =0; i < n; i++) {
			System.out.println((x + 1) + " " + (x + 2) + " " + (x + 3) + " PUM");
			x +=4;
		}

	}
}
