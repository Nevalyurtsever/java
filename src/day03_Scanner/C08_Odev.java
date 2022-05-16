package day03_Scanner;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {
        //Kullanıcıdan dikdortgenler prizmasının uzun kısa kenarlarını ve yukseklıgını ısteyip prizmanın hacmını hesaplayın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen Prizmanın uzun kenar kısa kenar ve yukseklıgını giriniz");
        int uzunKenar= scan.nextInt();
        int kisaKenar=scan.nextInt();
        int yukseklik=scan.nextInt();

        int hacim=uzunKenar*kisaKenar*yukseklik;
        System.out.println("Prizmanın Hacmi: "+hacim);
    }
}
