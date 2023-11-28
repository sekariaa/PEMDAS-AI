package livecode;
import java.util.*;

public class MariBerhitung {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);
    int bilangan1 = input.nextInt();
    int bilangan2 = input.nextInt();
    int bilangan3 = input.nextInt();
    int bilangan4 = input.nextInt();
    int bilangan5 = input.nextInt();
    int bilangan6 = input.nextInt();
    int bilangan7 = input.nextInt();
    int bilangan8 = input.nextInt();
    
    System.out.print(bilangan1 + bilangan2 + " ");
    System.out.print(bilangan3 - bilangan4 + " ");
    System.out.print(bilangan5 * bilangan6 + " ");
    System.out.printf("%.1f", ((float) bilangan7 / bilangan8));
}
}
