import java.util.Scanner;

public class Uri_113 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;
		int y;
		
		while (true) {
			x = scan.nextInt();
			y = scan.nextInt();
		
			if (x > y) {
				System.out.println("Decrescente");
			} else if (y > x) {
				System.out.println("Crescente");
		 	} 	else {
				break;
			}
	    }
	}
}