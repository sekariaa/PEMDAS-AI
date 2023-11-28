package livecode;

import java.util.Scanner;

public class MembalikkanKalimat {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String kalimatAwal = scanner.nextLine();
        
        String kataBalik = "";
        String kata = "";
        
        for (int i = 0; i < kalimatAwal.length(); i++) {
            char currentChar = kalimatAwal.charAt(i);
            if (currentChar != ' ') {
                kata = currentChar + kata;
            } else {
                if (kata.length() <= 4) {
                    kataBalik += kata + " ";
                } else {
                    String kataTerbalik = "";
                    for (int j = kata.length() - 1; j >= 0; j--) {
                        kataTerbalik += kata.charAt(j);
                    }
                    kataBalik += kataTerbalik + " ";
                }
                kata = "";
            }
        }
        // Menangani kata terakhir dalam kalimat
        if (kata.length() <= 4) {
            kataBalik += kata;
        } else {
            String kataTerbalik = "";
            for (int j = kata.length() - 1; j >= 0; j--) {
                kataTerbalik += kata.charAt(j);
            }
            kataBalik += kataTerbalik;
        }

        System.out.println(kataBalik);
  }
}
