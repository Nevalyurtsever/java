package orn;

import java.util.Scanner;

public class orn2 {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kelime giriniz");
        String kelime = scan.next();

        if (kelime.length() < 3) {
            System.out.println("kelime cok kısa");
        } else if (kelime.length() == 3) {
            uckelimeterstenyazdir(kelime);
        } else if (kelime.length() == 4) {
            dortkelimeterstenyazdir(kelime);
        } else if (kelime.length() == 5) {
            beskelimeterstenyazdir(kelime);

        } else {
            System.out.println("kelime cok uzun");
        }
    }

    public static void beskelimeterstenyazdir(String kelime) {
        String tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("kelime sayınız: " + kelime.length());
        System.out.println("kelimenin tersten yazılısı: " + tersKelime);
    }

    public static void dortkelimeterstenyazdir(String kelime) {
       String tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("kelime sayınız: " + kelime.length());
        System.out.println("kelimenin tersten yazılısı: " + tersKelime);
    }

    public static void uckelimeterstenyazdir(String kelime) {
        String tersKelime = kelime.substring(2) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("kelime sayınız: " + kelime.length());
        System.out.println("kelimenin tersten yazılısı: " + tersKelime);
    }
}
