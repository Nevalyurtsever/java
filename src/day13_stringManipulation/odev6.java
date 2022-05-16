package day13_stringManipulation;

import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
        //kullanıcıdan 4 harfli bir kelime girin girilen kelimeyı tersten yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime giriniz");
        String isim= scan.next();
        String ekle="";
        ekle+=isim.charAt(isim.length()-1);
        ekle+=isim.charAt(isim.length()-2);
        ekle+=isim.charAt(isim.length()-3);
        ekle+=isim.charAt(isim.length()-4);

        System.out.println(ekle);
    }
}
