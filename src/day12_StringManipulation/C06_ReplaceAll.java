package day12_StringManipulation;

import java.util.Scanner;

public class C06_ReplaceAll {
    public static void main(String[] args) {
        //kullanıcıdan isim  soy ısım bilgisini alıp
        //butun harflerı * yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ısım giriniz");
        String isim= scan.next();
        System.out.println("lutfen soy ısım giriniz");
        String soyİsim= scan.next();
        isim=isim.replaceAll("\\w","*");
     soyİsim=soyİsim.replaceAll("\\w","*");
        System.out.println(isim+" "+soyİsim);





    }
}
