package livecode;

import java.util.Scanner;

/**
 * MengenalBilangan
 */
public class MengenalBilangan {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int bil = input.nextInt();
      
      String cek1 = (bil % 2 == 0) ? "genap" : "ganjil";
      String cek2 = (bil < 50) ? "kecil" : "besar";

      System.out.println(bil + " adalah bilangan " + cek1 + " dan " + cek2);
    }
}