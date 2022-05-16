package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        //Kullanıcıdan aldıgınız 4 basamaklı bir sayının basamaklar toplamını bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı tam sayı giriniz");
        int sayi=scan.nextInt();

        int rakamlarToplamı=0;
        int rakam=0;

         rakam=sayi%10;  //1234
        rakamlarToplamı+=rakam;//4

        sayi/=10; //123
        rakam=sayi%10;
        rakamlarToplamı+=rakam;//4+3

        sayi/=10; //12
        rakam=sayi%10; //2
        rakamlarToplamı+=rakam;//4+3+2

       rakam= sayi/=10; //1

        rakamlarToplamı+=rakam;

        System.out.println("rakamlar toplamı: "+rakamlarToplamı);


    }
}
