package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    //Kullanıcıdan kacıncı ay oldugunu alıp mevsimi yazdıran bir
    //switch olusturun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacıncı ay oldugunu giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ılkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;


            default:
                System.out.println("gecerli numara giriniz");


        }
    }
}