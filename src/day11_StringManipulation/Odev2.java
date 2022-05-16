package day11_StringManipulation;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //kullanıcıdan bir cumle ve bir kelime isteyin kelimenin cumledeki kullanımına bakarak asagıdakı 3 cumleye uygun
        //olanı yazdırın
        //girilen kelime cumlede kullanılmamıstır
        //girilen kelime cumlede 1 kere kullanılmıstır
        //girilen kelime cumlede 1 den fazla kullammıl ıstır

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.next();
        int index=cumle.indexOf(kelime);
        if (index<0){
            System.out.println("girdiginiz kelime cumlede kullanılmamıstır");
        }else if(cumle.indexOf(kelime,index+1)<0){
            System.out.println("girdiginiz kelime cumlede 1 kere kullanılmıstır");
        }else {
            System.out.println("girdiginiz kelime cumlede birden fazla kullanılmıstır");
        }
    }
}
