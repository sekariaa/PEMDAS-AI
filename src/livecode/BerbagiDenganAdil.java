package livecode;
import java.util.Scanner;

public class BerbagiDenganAdil {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        long bilangan1 = input.nextLong();
        long bilangan2 = input.nextLong();
        
        long hasilModulo = bilangan1 % bilangan2;
        
        System.out.println("Sisa takjil Mochi adalah: " + hasilModulo);
    }
}
