package day10_switch_StringManipulation;
//Kullanıcıdan haftanın kacıncı gunu oldugunu sorun ve gun ısmını yazdır

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen haftanın kacıncı gunu oldugunu yazınız");
        int gunNo = scan.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " pazartesidir");
                break;
            case 2:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " salıdır");
                break;
            case 3:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " carsambadır");
                break;
            case 4:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " persembedir");
                break;
            case 5:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " cumadır");
                break;
            case 6:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " cumartesidir");
                break;
            case 7:
                System.out.println("Girdiginiz gun numarası: " + gunNo + " pazardır");
                break;
            default:
                System.out.println("lutfen gecerli gun numarası giriniz");

        }

    }
}