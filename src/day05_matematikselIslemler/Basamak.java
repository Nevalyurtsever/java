package day05_matematikselIslemler;

import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        //123456 ornegını yapalım
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 6 basamaklı sayı giriniz");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplamı=0;

        rakam=sayi%10;
        rakamlarToplamı+=rakam; //6 i verir
        sayi/=10; //12345
        rakam=sayi%10; // 5 i verir
        rakamlarToplamı+=rakam;
        sayi/=10; //1234
        rakam=sayi%10; //4 u verir
        rakamlarToplamı+=rakam;
        sayi/=10;//123
        rakam=sayi%10; //3 u verir
        rakamlarToplamı+=rakam;
        sayi/=10;//12
        rakam=sayi%10;//2 yı verir
        rakamlarToplamı+=rakam;
        sayi/=10;//1 i verir
        rakamlarToplamı+=sayi;
        System.out.println("6 basamaklı sayının rakamlar toplamı: "+rakamlarToplamı);
    }
}
