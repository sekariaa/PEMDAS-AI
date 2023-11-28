package livecode;

import java.util.Scanner;

public class BerapaYa {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int batasBawah = scanner.nextInt();
        int batasAtas = scanner.nextInt();

        if (batasBawah > batasAtas) {
            System.out.println("Batas bawah lebih besar dari batas atas.");
        } else {
            int angka = batasBawah;
            int totalPrima = 0;

            while (angka <= batasAtas) {
                boolean isPrima = true;
                int pembagi = 2;

                while (pembagi <= angka / 2) {
                    if (angka % pembagi == 0) {
                        isPrima = false;
                        break;
                    }
                    pembagi++;
                }

                if (isPrima && angka > 1) {
                    totalPrima += angka;
                }
                angka++;
            }
                System.out.println("Total: " + totalPrima);
            }
  }
}
