import java.util.Scanner;
public class Home {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final double CM_PER_INCH = 2.54; //inch

		int inches = scan.nextInt();
		double answer = inches * CM_PER_INCH;

		System.out.printf("%d in.=%.2f cm%n ", inches,answer);




	 
    }
 
}

        
