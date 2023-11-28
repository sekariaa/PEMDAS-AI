package livecode;

import java.util.Scanner;

public class ApaJurusanmu {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      	Scanner input = new Scanner(System.in);
        String nim = input.nextLine();

        // Kode untuk mengukur panjang input
        if (nim.length() == 15) {
            String kodeProdi = nim.substring(5, 8);

            // Kode untuk melakukan seleksi program studi
            switch (kodeProdi) {
                /*
                 * Lanjutkan kode disini
                 * Jangan ubah kode sebelumnya
                 * Do your magic here :)
                 */
                    case "040":
                    System.out.println("Jurusan: Sistem Informasi");
                    break;
                case "070":
                    System.out.println("Jurusan: Teknologi Informasi");
                    break;
                case "020":
                    System.out.println("Jurusan: Teknik Informatika");
                    break;
                case "060":
                    System.out.println("Jurusan: Pendidikan Teknologi Informasi");
                    break;
                case "030":
                    System.out.println("Jurusan: Teknik Komputer");
                    break;
                case "050":
                    System.out.println("Jurusan: Magister");
                    break;
                default:
                    System.out.println("Kode Program Studi tidak dikenali");
                    break;
            }
            
        } else {
            System.out.println("NIM harus terdiri dari 15 angka.");
        }
    }
}
