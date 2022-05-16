package day_18nestedForLoop;

import java.util.Scanner;

public class orn3 {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan=new Scanner(System.in);
        int toplam=0;// asagıdakı conditıon u yazmak ıcın bunu yazmak zorunda kaldık
        while (toplam<500){
            System.out.println("lutfen sayı gırınız");
            int sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);
    }
}
