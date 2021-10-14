 import java.util.Scanner;

     public class Prov {
        public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      final double PI_NUMBER = 3.14159;
      double radius = scan.nextDouble();
      double answer = ((4.0/3) * PI_NUMBER * Math.pow(radius, 3));

      System.out.printf("VOLUME = %.3f%n", answer);

            
        
        
        
    }
     
 }