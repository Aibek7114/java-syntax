import java.util.Scanner;

public class ShowCurrentTime {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

	
		long milliseconds = System.currentTimeMillis(); // от 1 января 1970г в миллисек

		long totalSeconds = milliseconds / 1000;  // 1000 % 60 время в сек с 1970г

		long currenSeconds = totalSeconds % 60;   // Тек сек

		long totalMimutes = totalSeconds / 60;    //  общее в минутах 

		long currentminutes = totalMimutes % 60;  // тек минуты

		long totalHours = totalMimutes / 60;   // Общее время в часах 

		long currentHours = totalHours % 24 + 6l;  // тек  часы 

		long totalDays = totalHours / 24; // общие 

		long currentDay = totalDays % 30; // месcяц 

		long totalMonth = totalDays / 30;

		long currentMonth = totalMonth % 12;

		long totalYears = totalMonth / 12;


		System.out.printf("Current time is Year %d Month %d Day %d %d:%d:%d%n", 
			totalYears + 1970,
			currentMonth,
			currentDay, 
			currentHours, 
			currentminutes, 
			currenSeconds);
		

	}
}