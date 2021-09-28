import java.util.Scanner;

public class Temperature{
      public static void main(String[] args){
          double Cels, fahrenheit;
          Scanner in = new Scanner(System.in);

          System.out.print("Input you temperature in Celsius:");
          Cels = in.nextDouble();
          System.out.println("You said: " + Cels);

          fahrenheit = Cels * 9.0 / 5.0 + 32.0;
          System.out.printf("The temperature in Celsius is %.1f degrees\n", fahrenheit);
      }
}
