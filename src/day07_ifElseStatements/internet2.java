package day07_ifElseStatements;

import java.util.Scanner;

public class internet2 {
    public static void main(String[] args) {

        //Girilen sayı hem 2 ile hem de 3 ile tam bölünebiliyorsa “2 ve 3’ün katı”, sadece 2 ile bölünebiliyorsa
        //  “2’nin katı”, sadece 3 ile bölünebiliyorsa “3’ün katı”,
        //ne 2’ye ne de 3’e bölünmüyorsa “2 veya 3’ün katı değil” mesajı veren program

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayı gırınız");
        int sayi = scan.nextInt();

        if (sayi%2==0 && sayi%3==0) {
            System.out.println("2 ve 3 un katı");
        } else if (sayi%2==0) {
            System.out.println("2 nın katı");
        }else if(sayi%3==0) {
            System.out.println("3 un katı");
        }else {
            System.out.println("ne 2 ye ne 3 e bolunmuyor");
        }
    }//dar kapsamlıyı en basa yazarız
}