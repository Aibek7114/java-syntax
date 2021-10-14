import java.util.Scanner;
import java.util.Random;

public class Conditions {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rnd = new Random();

		int x = rnd.nextInt(100);
		int y = rnd.nextInt(100);

		int correctAnswer = x + y;

		System.out.printf("%d + %d = ", x , y);
		int userAnswer = scan.nextInt();

		if (correctAnswer == userAnswer) {
			System.out.println("You are correct");
		}  else   /* if (correctAnswer != userAnswer)*/ {
			System.out.println("You answer is incorrect");
			System.out.printf("%d + %d is %d%n", x, y, correctAnswer);
		}


	}
}