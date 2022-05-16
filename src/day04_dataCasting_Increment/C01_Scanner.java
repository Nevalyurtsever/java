package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

  //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen İsminizi Giriniz");
        char ilkHarf=scan.next().charAt(0);
        //charAt(index) methodu paremetre olarak yazdıgımız index'deki char'ı bize getirir.
        System.out.println("İsminizin İlk Harfi: "+ilkHarf);


    }
}
