package day13_stringManipulation;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        //kullanıcıdan isim isteyin eger isim "a" iceriyorsa girdiginiz isim a iceriyor
        //isim Z iceriyorsa girdiginizsisim z iceriyor
        //ikiside yoksa "girdiginiz isim a ve Z harfi icermiyor

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ısım giriniz");
        String isim=scan.next();

    if (isim.contains("a")){
        System.out.println("isminiz a iceriyor");
    }else if(isim.contains("Z")){
        System.out.println("isminiz Z iceriyor");
    }else if (!isim.contains("a") && !isim.contains("Z")){
        System.out.println("isim a ve Z icermiyor");
    }

    }
}
