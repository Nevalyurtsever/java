package day11_StringManipulation;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        //kullanıcıdam bir cumle ve bir kelime isteyin cumlede var olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        char harf = scan.next().charAt(0);

        if (cumle.indexOf(harf) == -1) {
            System.out.println("girdiginiz harf cumlede yoktur");


        } else {
            System.out.println("girdiginiz harf cumlede vardır");
        }

    }
}