package livecode;

import java.util.Scanner;

public class PipPipParkir {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // System.out.print("Masukkan jenis kendaraan (1 untuk motor, 2 untuk mobil, 3 untuk bus): ");
        int jenisKendaraan = input.nextInt();

        // System.out.print("Masukkan lama parkir dalam jam: ");
        int lamaParkir = input.nextInt();

        // System.out.print("Masukkan uang yang dibayarkan: ");
        int uangBayar = input.nextInt();

        int biayaParkir = 0;
        switch (jenisKendaraan) {
            case 1:
                biayaParkir = lamaParkir * 2000;
                break;
            case 2:
                biayaParkir = lamaParkir * 4000;
                break;
            case 3:
                biayaParkir = lamaParkir * 9000;
                break;
            default:
                System.out.println("Jenis kendaraan tidak valid.");
                return;
        }

        // Cek apakah uang yang dibayarkan pas, kurang, atau lebih
        if (uangBayar == biayaParkir) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (uangBayar < biayaParkir) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            int kembalian = uangBayar - biayaParkir;
            int uang10Ribu = kembalian / 10000;
            kembalian %= 10000;
            int uang5Ribu = kembalian / 5000;
            kembalian %= 5000;
            int uang500 = kembalian / 500;
            kembalian %= 500;
            int uang100 = kembalian / 100;

            System.out.println("Anda mendapatkan kembalian sebesar:");
            System.out.println(uang10Ribu + " uang 10.000");
            System.out.println(uang5Ribu + " uang 5.000");
            System.out.println(uang500 + " uang 500");
            System.out.println(uang100 + " uang 100");
        }
  }
}
