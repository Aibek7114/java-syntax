import java.util.Scanner;

public class SumOfDigis {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
        System.out.print("Введите 4х значное число: ");

		int number =scan.nextInt();                                //1+2+3+4=10
		int sum = 0;                                                // trash

        sum += number % 10;                                         // 0 + 4 = 4
        number /= 10;                                                // 1234 / 10 = 123

		sum += number % 10;                                          // 4 + 3 = 7
        number /=  10;                                             // 123 / 10 = 12

        sum += number % 10;                                       // 7 + 2 = 9
        number /=  10;                                            // 12 / 10 = 1

        sum += number % 10;                                       // 9 + 1 = 10
        number /=  10;                                           // 1 / 10 = 0

        System.out.println(sum);
        






		

	}
}