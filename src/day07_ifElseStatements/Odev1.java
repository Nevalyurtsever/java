package day07_ifElseStatements;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //// kullanıcıdan gun ısımlerınden bırınız ilk harfınıısteyin o harfle baslayan isimlerini yazdırın
        //		//orn ilkHrf=P output="pazar pazartesı veya persembe"
        //		//ilk harf=S ise cıktı salı

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Gun İsimlerınden Birinin ilk harfini giriniz");
        char ilkHarf=scan.next().toLowerCase().charAt(0);

        if (ilkHarf=='p') {
            System.out.println("pazar pazartesi ve persembe");
        }else if (ilkHarf=='s') {
            System.out.println("salı");
        }else if (ilkHarf=='c'){
            System.out.println("carsamba cuma cumartesi");
        }else {
            System.out.println("lutfen gecerli gun ismi giriniz");
        }
    }
}
