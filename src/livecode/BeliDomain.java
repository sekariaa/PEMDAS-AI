package livecode;

import java.util.Scanner;

public class BeliDomain {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String emaillama=sc.next();
        String emailbaru=sc.next();
        String domain=sc.next();
        double harga=sc.nextDouble();
        
        int masuk=emaillama.lastIndexOf(".");//
        String namadomain=emaillama.substring(masuk, emaillama.length());
        
        System.out.println("New email domain: " +emailbaru+"@"+domain+namadomain);
        System.out.println("New domain name: "+domain+namadomain);
        
        if(emaillama.contains("com")){
            double harga1=harga*1.5;
            System.out.printf("Total purchase price: %.2f%c", harga1,'$');
        }
        else if(emaillama.contains("id")){
            double harga2=harga*1.75;
            System.out.printf("Total purchase price: %.2f%c", harga2,'$');
        }
        else if(emaillama.contains("net")){
            double harga3=harga*1.25;
            System.out.printf("Total purchase price: %.2f%c", harga3,'$');
        }
        else{
            System.out.printf("Total purchase price: %.2f%c", harga,'$');
        }
    }
}
