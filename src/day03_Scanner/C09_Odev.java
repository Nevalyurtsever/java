package day03_Scanner;

import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {
        //kullanıcıdan ismini alıp bas harfını yazdıralım
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen İsminizi Giriniz");
        char isim=scan.next().toUpperCase().charAt(0);
        System.out.println("İsminizin Bas Harfi: "+isim);
    }
}
