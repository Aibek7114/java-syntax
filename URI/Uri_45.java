import java.util.Scanner;

public class Uri_45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();

		double n1 = Math.max(x, Math.max(y, z));
		double n2 = 0;
		double n3 = 0;

		if (n1 == x) {
			n2 = Math.max(y, z);
			n3 = Math.min(y, z);
		}  if (n1 == y) {
			n2 = Math.max(x, z);
			n3 = Math.min(x, z);		
		} 
		if (n1 == z) {
			n2 = Math.max(y, x);
			n3 = Math.min(y, x);
		}

		System.out.ptintln(n1);
		System.out.ptintln(n2);
		System.out.ptintln(n3);
		
	}
}