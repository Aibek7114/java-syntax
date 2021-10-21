import java.util.Scanner;

public class Authentication {

	static Scanner scan;

	public static void main(String[] args) {
		run();
		}

		static void run() {
			init();
			while (true){
				System.out.print("Operation: ");
				String operation = scan.nextLine();
				switch (operation) {
					case "register":
					readData();
					break;

				case "exit":
					return;
				}
			}			
		}
		static void init() {
			scan = new Scanner(System.in);
		}

		static void readData() {
			System.out.print("First name: ");
			String FirstName = processData(scan.nextLine(), "[a-zA-Z]+", "First name must contains only letters");

			System.out.print("Last name: ");
			String LastName = processData(scan.nextLine(), "[a-zA-Z]+", "Last name must contains only letters");

			System.out.print("Email: ");
			String Email = processData(scan.nextLine(), "[a-zA-Z0-9_]+\\@[a-z]+\\.[a-z]{3}", "invalid email: example_mail@gmail.com");

			System.out.print("Data of birth: ");
			String DataOfBirth = processData(scan.nextLine(), "\\d{2}(-|.)\\d{2}(-|.)\\d{4}", "invalid data: data folmal dd-MM-yyyy");

			System.out.print("Phone number: ");
			String PhoneNumber = processData(scan.nextLine().replaceAll("\\s+", " "), "\\+*\\d{12}", "invalid phone number");
		}
		static String processData(String data, String regex, String errorMessage) {
			while (!data.matches("regex")) {
				System.out.println(errorMessage);
				System.out.print("Try again: ");
				data = scan.nextLine();

			}
			return data;
		}
	}

