package day13_stringManipulation;

import java.util.Scanner;

public class odev7 {
    public static void main(String[] args) {
        //kullanıcıdan ismini soy ismini ve kredi kartı bılgılerını ısteyin
        //ve asagıdakı gibi yazdırın
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scan.next();
        System.out.println("lutfen soy ısmınızı giriniz");
        String soyİsim = scan.next();
       System.out.println("lutfen 16 nolu kredi kart numaranızı giriniz");
       String kk= scan.next();

        isim=isim.toUpperCase().substring(0,1)+isim.substring(1).replaceAll("\\w","*");
        System.out.println(isim);
        soyİsim=soyİsim.toUpperCase().substring(0,1)+soyİsim.substring(1).replaceAll("\\w","*");
        System.out.println(soyİsim);
        kk="**** **** **** "+kk.substring(12);
        System.out.println(kk);
    }
}
