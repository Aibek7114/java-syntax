import java.util.Scanner;

public class BankCoins {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		double money = scan.nextDouble(); //576.73
		
		int coin = (int) money;
		int coins = ((int)(money*100)%100);

		System.out.println("NOTAS:");
		
		System.out.printf("%d nota(s) de R$ 100.00%n", coin / 100);
		coin %= 100;

		System.out.printf("%d nota(s) de R$ 50.00%n", coin / 50);
		coin %= 50;

		System.out.printf("%d nota(s) de R$ 20.00%n", coin / 20);
		coin %= 20;

		System.out.printf("%d nota(s) de R$ 10.00%n", coin / 10);
		coin %= 10;

		System.out.printf("%d nota(s) de R$ 5.00%n", coin / 5);
		coin %= 5;

		System.out.printf("%d nota(s) de R$ 2.00%n", coin / 2);
		coin %= 2;

		System.out.println("MOEDAS:");
		
		System.out.printf("%d moeda(s) de R$ 1.00%n", coin); 
		
		System.out.printf("%d moeda(s) de R$ 0.50%n", coins / 50); 
		coins %= 50; 
		System.out.printf("%d moeda(s) de R$ 0.25%n", coins / 25); 
		coins %= 25; 
		System.out.printf("%d moeda(s) de R$ 0.10%n", coins / 10); 
		coins %= 10; 
		System.out.printf("%d moeda(s) de R$ 0.05%n", coins / 5); 
		coins %= 5; 
		System.out.printf("%d moeda(s) de R$ 0.01%n", coins); 
		

	
		
	}
}

