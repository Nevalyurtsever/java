package orn;

import java.util.Scanner;

public class orn_01 {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        //  bu 4 kontrolu method ile yapin


        String sifre = "Aaaaaaa";



     boolean khk=   kucukHarfKontrol(sifre);
      boolean bk=  boslukKontrolSifre(sifre);
       boolean uk= uzunlukKontrol(sifre);
       boolean bhk= buyukHarfKontrol(sifre);

       if (khk && bk && uk && bhk ){
           System.out.println("sifreniz basarılı");
       }else {
           System.out.println("sıfreniz basarısız");
       }
    }

    private static boolean uzunlukKontrol(String sifre) {
        boolean uzunlukSonuc = false;
        if (sifre.length() >= 8) {
            uzunlukSonuc = true;
        } else {
            uzunlukSonuc = false;
            System.out.println("8 harften az olmamalı");
        }
        return uzunlukSonuc;
    }

    private static boolean boslukKontrolSifre(String sifre) {
        boolean boslukSonuc = false;
        if (!sifre.contains(" ")) {
            boslukSonuc = true;
        } else {
            boslukSonuc = false;
            System.out.println("bosluk ucermemeli");
        }


        return boslukSonuc;
    }

    private static boolean kucukHarfKontrol(String sifre) {
        boolean kucukHarfsonuc = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) >= 'a') {
            kucukHarfsonuc = true;
        } else {
            System.out.println("son harfi kucuk olmalı");
            kucukHarfsonuc = false;
        }
        return kucukHarfsonuc;
    }

    private static boolean buyukHarfKontrol(String sifre) {
        boolean buyukHarfSonuc = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            buyukHarfSonuc = true;

        } else {
            System.out.println("sifrenizin ilk harfi buyuk olmalı");
            buyukHarfSonuc = false;
        }

        return buyukHarfSonuc;
    }
}
