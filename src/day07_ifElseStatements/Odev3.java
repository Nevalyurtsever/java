package day07_ifElseStatements;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //kullanıcıdan bir gun alın eger gun cuma ıse ekrana muslumanlar ıcın kutsal gun yazdırın
        //cumartesı ise ekrana yahudiler ıcın kutsal gun yazdırın pazar ıse hristiyanlar ıcın kutsal gun yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("cuma")){
            System.out.println("muslumanlar ıcın kutsal gun");
        }else if (gun.equals("cumartesi")){
            System.out.println("yahudiler ıcın kutsal gun");
        }else if(gun.equals("pazar")) {
            System.out.println("hristiyanlar ıcın kutsal gun");
        }else {
            System.out.println("lutfen gecerli gun giriniz");
        }



    }
}
