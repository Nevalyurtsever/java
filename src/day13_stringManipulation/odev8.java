package day13_stringManipulation;

import java.util.Scanner;

public class odev8 {
    public static void main(String[] args) {
//kullanıcıdan bir sifre girmesini isteyin Asagıdakı sartları saglıyorsa sifre basarı ıle tanımlandı yazınız
        //sartları saglamaz ise islem basarısız lutfen yenı bir sıfre gırın yazdırın
        //ilk harf buyuk olmalı
        //son harf kucuk olamalı
        //sifre bosluk ıcermemelı
        //sifre uzunlugu en az 8 karakter olmalı

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre = scan.nextLine();
        if (sifre.length() >= 8) {
            if (!sifre.contains(" ")) {
                if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                    if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                        System.out.println("sifre basarı ıle tanımlandı");
                    }else{
                        System.out.println("sıfre kucuk harf ile birmeli");
                    }
                }else{
                    System.out.println("sifre buyuk harf ile baslamalı");
                }
            }else{
                System.out.println("sifre bosluk ıcermemelı");
            }

        } else{
            System.out.println("sifre uzunlugu en az 8 karakter olmalı");
        }
}
}