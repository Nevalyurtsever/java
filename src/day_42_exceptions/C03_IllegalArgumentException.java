package day_42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        int yas = scan.nextInt();
        if (yas <= 0 || yas > 120) {
            //    System.out.println("Lutfen gecerli bir sayı gırınız");
            //Java bizim istedigimiz durumlarda exception fırlatabılır
            throw new IllegalArgumentException();
        } else {
            System.out.println("uygun yas girdiniz tesekkurler");
        }

    }
}
