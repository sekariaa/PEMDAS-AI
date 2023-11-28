package livecode;

import java.util.Scanner;

/**
 * HappyBirthdayKawan
 */
public class HappyBirthdayKawan {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      	Scanner sc = new Scanner(System.in);
        String NIK = sc.next();

        // Kode untuk memeriksa panjang input NIK
        if (NIK.length() != 16) {
            System.out.println("NIK tidak valid.");
            return;
        }

        // Kode untuk memisah input menjadi bagian yang memuat informasi tanggal, bulan, dan tahun
        String tanggalLahir = NIK.substring(6, 12);
        int tgl = Integer.parseInt(tanggalLahir.substring(0, 2));
        int bln = Integer.parseInt(tanggalLahir.substring(2, 4));
        int thn = Integer.parseInt(tanggalLahir.substring(4, 6));

        /*
         * Jangan ubah potongan kode diatas
         * Lanjutkan potongan kode disini, selamat mengerjakan :)
         * 
         * Do not change the code snippet above
         * Do your magic here :)
         */
        
        if (tgl >= 40) {
            tgl -= 40;
        }

        if (thn <= 23) {
            thn += 2000;
        } else {
            thn += 1900;
        }

        boolean isValidDate = false;

        if (thn % 4 == 0) {
            if (bln != 2 && bln < 8) {
                if ((bln % 2 == 0 && tgl >= 1 && tgl <= 30) || (bln % 2 != 0 && tgl >= 1 && tgl <= 31)) {
                    isValidDate = true;
                }
            } else if (bln != 2 && bln >= 8) {
                if ((bln % 2 != 0 && tgl >= 1 && tgl <= 30) || (bln % 2 == 0 && tgl >= 1 && tgl <= 31)) {
                    isValidDate = true;
                }
            } else if (bln == 2) {
                if (tgl >= 1 && tgl <= 29) {
                    isValidDate = true;
                }
            }
        } else {
            if (bln != 2 && bln < 8) {
                if ((bln % 2 == 0 && tgl >= 1 && tgl <= 30) || (bln % 2 != 0 && tgl >= 1 && tgl <= 31)) {
                    isValidDate = true;
                }
            } else if (bln != 2 && bln >= 8) {
                if ((bln % 2 != 0 && tgl >= 1 && tgl <= 30) || (bln % 2 == 0 && tgl >= 1 && tgl <= 31)) {
                    isValidDate = true;
                }
            } else if (bln == 2) {
                if (tgl >= 1 && tgl <= 28) {
                    isValidDate = true;
                }
            }
        }

        if (isValidDate) {
            System.out.println("Tanggal lahir: " + tgl + "/" + bln + "/" + thn);
        } else {
            System.out.println("NIK tidak valid.");
        }
  }
}