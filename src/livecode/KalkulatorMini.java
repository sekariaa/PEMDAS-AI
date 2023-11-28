package livecode;

import java.util.Scanner;

public class KalkulatorMini {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = new Scanner(System.in);
      int choice, num, result;

      do {
          choice = scanner.nextInt();

          switch (choice) {
              case 1:
                  num = scanner.nextInt();
                      result = num * num;
                      System.out.println("Squared result: " + result);
                  break;
              case 2:
                  num = scanner.nextInt();
                    if (num >= 0) {
                      result = 1;
                      for (int i = 1; i <= num; i++) {
                          result *= i;
                      }
                      System.out.println("Factorial result: " + result);
                  } else {
                      System.out.println("Factorial is only applicable to positive integers.");
                  }
                  break;
              case 0:
                  System.out.println("The program has ended.");
                  break;
              default:
                  System.out.println("Invalid choice. Please choose again.");
                  break;
          }
      } while (choice != 0);
  }
}

