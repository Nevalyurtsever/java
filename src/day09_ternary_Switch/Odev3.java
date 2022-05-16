package day09_ternary_Switch;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi alın sayı pozitif ise "sayı pozitif" negatif ise sayının karesini yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz");
        int sayi= scan.nextInt();
        System.out.println(sayi>0 ? "sayı pozitif" : (sayi*sayi));

    }
}
