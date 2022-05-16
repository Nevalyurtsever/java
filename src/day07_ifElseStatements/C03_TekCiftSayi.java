package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayınız cıft sayi");
        }
        if(sayi%2!=0){
            System.out.println("sayınız tek sayı");
        }
        //normalde bir sayı tektır veya cıfttır ucuncu bir durum yoktur
        //ozman tek olması ve cıft olmasını iki  ayrı if ile degil
        //if else ile tek statement da yapması daha guzel olur
        //======= if else ile cozumu ==========
        if (sayi%2==0) {
            System.out.println("girdiginiz sayı cıft sayıdır");
        }else {
            System.out.println("girdiginiz sayı tek sayıdır");
        }
    }
}
