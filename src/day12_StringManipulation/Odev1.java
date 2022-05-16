package day12_StringManipulation;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //Kullanıcıdan bir cumle ısteyın cumle "buyuk kelımesı ıcerıyorsa tum cumleyı buyuk harf olarak
        //"kucuk kelimesi ıceriyorsa tum cumleyı kucuk harf olarak yazdırın
        //iki kelimeyı de ıcermıyorsa cumle kucuk buyuk kelime ıcermiyor yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        if (!cumle.contains("buyuk") && !cumle.contains("kucuk")) {
            System.out.println("cumle kucuk buyuk kelime ıcermiyor");
        } else if (cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("cumle hem buyuk hem kucuk kelimesi iceriyor");
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        }
    }
}
