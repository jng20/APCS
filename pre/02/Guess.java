import java.util.Random;
import java.util.Scanner;

public class Guess{
      public static void main(String[] args){

          int usernumb, difference;
          Scanner in = new Scanner(System.in);

          System.out.print("Pick a number between 0 and 100 inclusive:");
          usernumb = in.nextInt();
          System.out.println("You picked " + usernumb);

          Random random = new Random();
          int number = random.nextInt(100) + 1;
          System.out.println("The number generated is " + number);

          difference = Math.abs(number - usernumb);
          System.out.println("The difference is "+ difference);


      }
}
