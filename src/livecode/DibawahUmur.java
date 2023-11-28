package livecode;

import java.util.Scanner;

public class DibawahUmur {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String sensoran=sc.nextLine();
    if(a.contains(sensoran)){
        String star="*";
        int katasensor= sensoran.length();
        String sensorfix=star.repeat(katasensor);
        String c=a.replace(sensoran,sensorfix);
        System.out.println(c);
    }
    else{
       System.out.println("Kalimat aman"); 
    }
  }
}
