import java.util.Scanner;

public class Uru_73 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		 	for (int i = 1; i <=x; i++){
		 		if (i % 2 == 0)
		 		System.out.println(i + "^" + 2 + " = " + (i * i));		
			}		
	}
}