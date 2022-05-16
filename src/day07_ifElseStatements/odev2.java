package day07_ifElseStatements;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        //kullanıcıdan dıkdortgenın kenar uzunluklarını giriniz kare olup olmadıgını yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdörtgenin kenar uzunluklarını giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();


        if (kenar1 == kenar2 ) {
            System.out.println("uzunluklarını girdiginiz dikdortgen karedir");
        }  else {
            System.out.println("uzunluklarını girdiginiz dikdortgen kare degildir");
        }
    }

}