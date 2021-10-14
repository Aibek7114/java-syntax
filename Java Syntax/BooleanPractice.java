import java.util.Scanner;

public class BooleanPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int x =(int) (Math.random() * 10);
		int y =(int) (Math.random() * 10);

		System.out.printf("%d + %d = ", x , y);
		int answer = scan.nextInt();

		boolean isCorrect = (x + y) == answer;

		String answerCorrect = String.format("%d + %d is %d? %b ",  x , y, answer, isCorrect);
		String answerInCorrect = String.format ("%d + %d is %d? %b. Correct answer is %d", x, y, answer, isCorrect, (x+y));

		System.out.printf(isCorrect ? answerCorrect : answerInCorrect);
		



	}
}


/* Операторы сравнения 
		>
		<
		==
		>=
		<=
		!=
		Каждый из них генерирует boolean значение: либо true либо false
		*/