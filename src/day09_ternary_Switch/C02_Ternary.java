package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //Ternary ıle yapılan tum ıslemler ıf else ıle de yapılabılır
        //ıf else yerıne ternary tercih etme sebebi yapının bait ve anlasılır olmasıdır
        //ternary ıcerısınde kompleks kodlar olmaz
        //sadece sonuc veya bızı sonuca goturen basıt ıslemler olabılır

      //kullanıcıdan bır tamsayı alıp tek mı  ıcft mı yazdıran bir kod yazalım
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayı gırınız");
        int sayi= scan.nextInt();

if (sayi%2==0){
    System.out.println("sayı cıft");
}else {
    System.out.println("sayı tek");
}
    System.out.println(sayi%2==0 ? "cift sayı": "tek sayi");

    }
}
