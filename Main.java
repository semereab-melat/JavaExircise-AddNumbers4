import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * class Name : AddNumbers4
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Main {
   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      final int TERMINATOR = -999;
      int number, count = 0;
      double total = 0;

      System.out.println("Enter the first number: ");
      number = keyboard.nextInt();
      while (number != TERMINATOR) {
         total = total + number;
         count = count + 1;
         System.out.println("Enter a number (or -999 to finish): ");
         number = keyboard.nextInt();
      }//while

      System.out.println("\nThe total of the numbers is " + df.format(total));
      System.out.println("The average of the numbers is " + df.format(total / count));
   }//main
}//class