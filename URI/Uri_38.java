import java.util.Scanner;

public class Uri_38 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();

		switch (x) {
			case 1:
			    System.out.printf("Total: R$ %.2f%n", 4.00 * y);
			    break;
			case 2:
				System.out.printf("Total: R$ %.2f%n", 4.50 * y);
				break;
			case 3:
			    System.out.printf("Total: R$ %.2f%n", 5.00 * y);
			    break;
			case 4:
			    System.out.printf("Total: R$ %.2f%n", 2.00 * y);
			    break;
			case 5:
			    System.out.printf("Total: R$ %.2f%n", 1.50 * y);
			    break;
			}
		}
	}
			
