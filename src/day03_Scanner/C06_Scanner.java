package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yazınız");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
      String soyİsim=scan.nextLine();
        System.out.println("İsim - soyİsim :"+isim+" "+soyİsim);
    }
}
