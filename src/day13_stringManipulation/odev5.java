package day13_stringManipulation;

import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        //kullanıcıdan isim ve soy ısmını girin hanısının daha uzun old yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.next();
        System.out.println("lutfen soy ısmınızı giriniz");
        String soyİsim= scan.next();

        if (isim.length()>soyİsim.length()){
            System.out.println("ismizin uzunlugu daha fazladır");
        }else if (soyİsim.length()>isim.length()){
            System.out.println("soy isminizin uzunlugu daha fazladır");
        }else{
            System.out.println("isminizin uzunlugu ile soy ısmınızın uzunlugu esittir");
        }
    }
}
