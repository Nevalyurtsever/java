package day09_ternary_Switch;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı alın ve sayının mutlak degerini yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayı giriniz");
        int sayi= scan.nextInt();

        int sonuc=sayi>=0 ? sayi : (-1*sayi);
        System.out.println("Mutlak Deger: "+sonuc);
    }
}
