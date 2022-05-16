package day08_ifElseİfStatements;

import java.util.Scanner;

public class Odev_1 {
    public static void main(String[] args) {
        //kullanıcıdan maas ıcın bir teklif isteyin
        //teklif 80000 ustundeyse "kabul ediyorum"
        //60000-80000 arasında ise "konusabılırız"
        //60000 altıysa" maalesef kabul edemem"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Maas Teklifini Giriniz");
        int teklif= scan.nextInt();
        if (teklif>80000){
            System.out.println("Kabul Ediyorum");
        }else if (teklif>=60000) {
            System.out.println("Konusabiliriz");
        }else {
            System.out.println("Maalesef Kabul Edemem");
        }
    }
}
