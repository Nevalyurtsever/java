package day07_ifElseStatements;

import java.util.Scanner;

public class internet1 {
    public static void main(String[] args) {
        //Girilen sayı hem 4, hem 5, hem de 6 ile bölünebiliyorsa
        // “Sayı Uygun”, aksi halde “Sayı Uygun Değil” mesajı veren program
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır tam sayı gırınız");
        int sayi = scan.nextInt();

        if (sayi%4==0 && sayi%5== 0 && sayi%6==0) {
            System.out.println("sayı uygun");
        }else {
            System.out.println("sayı uygun degil");
        }
    }
}