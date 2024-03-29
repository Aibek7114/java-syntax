import java.util.Scanner;

public class Turtle {

	static Scanner scan = new Scanner(System.in);
	static String cmd;

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		
		while (true) {
			System.out.print("Action: ");
			cmd = scan.nextLine().toLowerCase().trim();

			readUserCommand();

			switch (cmd) {
				case "move":
					move(5);
					break;

				case "turnright":
					turnRight();
					break;

				case "turnleft":
					turnLeft();
					break;

				case "stop":
					return;
			}

		}
	}

	public static void move(int steps) {
		System.out.println("Turtle move: " + steps + " steps");
	}

	public static void turnLeft() {
		System.out.println("Turtle trun left");
	}

	public static void turnRight() {
		System.out.println("Turtle trun right");
	}

	public static void readUserCommand() {

		while (true) {	
			switch (cmd) {
				case "move":
				case "turnRight":
				case "turnLeft":
				case "stop":
					return;

			default:
				System.out.println("Invalid comand: " + cmd);
				System.out.print("Try again: ");
				cmd = scan.nextLine();
			}	
		}
	}
} 
