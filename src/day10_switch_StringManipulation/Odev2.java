package day10_switch_StringManipulation;

import java.util.Scanner;

public class Odev2 {
    //kullanıcıdan bir sayı girmesını isteyınız girilen sayı
  //  10 ise "iki basamakli en kucuk sayi"
    // 100 ise "uc basamakli en kucuk sayi"
 // 1000 ise "dort basamakli en kucuk sayi"

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayi=scan.nextInt();
        switch(sayi){
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Verilen ozelliklerdeki sayılardan biri degildir");

        }

    }
}
