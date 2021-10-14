import java.util.Scanner;
public class Variables {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		// типДанных название = значение;

		System.out.print("Fullname: ");
		String fullname = scan.nextLine();

		System.out.print("Age: ");
		int age = scan.nextInt();

		char gander = 'M';

		System.out.print("Is student: ");
		boolean isStudent = scan.nextBoolean();

		System.out.print("Inn: ");
		long inn = scan.nextLong();



        String fullnameq = "Aibek";
		int ageq = 28;
		char genderq = 'M';
		boolean isStudentq = true;
		long innq = 23454654654654L;
     
        float height = 170.1F;
        double weight = 70.6;

        System.out.println("My name is " + fullnameq);
        System.out.println("I am " + ageq + " years old");
        System.out.println("gendere:" + genderq);
        System.out.println("inn " +inn);
        System.out.println("Hei " + height);


        
	}
}