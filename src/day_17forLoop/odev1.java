package day_17forLoop;

import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
      /*  ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        toplayip, sonucu yazdiran bir program yaziniz*/

      Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2= scan.nextInt();

        int toplam=0;
        for (int i = sayi1; i <=sayi2 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);

    }
}
