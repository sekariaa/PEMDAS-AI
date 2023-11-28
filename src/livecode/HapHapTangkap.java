package livecode;

import java.util.Scanner;

public class HapHapTangkap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Input sudut elevasi dalam derajat
        double sudutElevasi = input.nextDouble();

        // Input kecepatan peserta lomba dalam km/jam
        double kecepatanPeserta = input.nextDouble();

        // Konversi sudut elevasi ke radian
        double sudutRadian = Math.toRadians(sudutElevasi);

        // Tinggi gedung
        double tinggiGedung = 50; // dalam meter

        // Waktu yang dibutuhkan untuk bola mencapai dasar gedung (dalam detik)
        double waktu = 6.0;

        // Konversi kecepatan peserta ke m/s
        double kecepatanPesertaMS = kecepatanPeserta * 1000.0 / 3600.0;
        // System.out.println("kecepatan " + kecepatanPesertaMS);

        // Menghitung jarak horizontal bola terhadap gedung (dalam meter)
        int jarakHorizontal = (int) Math.ceil(Math.tan(sudutRadian) * tinggiGedung);
        // System.out.println(jarakHorizontal);

        // Menentukan apakah peserta dapat menangkap bola
        boolean pesertaDapatMenangkap = (jarakHorizontal / kecepatanPesertaMS) <= waktu;
        // System.out.println(pesertaDapatMenangkap);
        System.out.println("Jarak horizontal bola terhadap gedung: " + jarakHorizontal + " meter");
        System.out.println("Peserta dapat menangkap bola: " + pesertaDapatMenangkap);
  }
}
