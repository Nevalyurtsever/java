package day_18nestedForLoop;

import java.util.Scanner;

public class orn2 {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

     /*Scanner scan=new Scanner(System.in);//10000 e kadar ıstedigimz kadar lutfen bir sayı giriniz yazar
        int toplam=0;
        for (int i = 0; i <10000 ; i++) {
            System.out.println("lutfen bir sayı giriniz");
            int sayi= scan.nextInt();
            if (sayi==0){
                break;
            }else{
                toplam+=sayi;
            }
        }
        System.out.println("sayıların toplamı: "+toplam); */

        Scanner scan=new Scanner(System.in);
        int sayi=1;// bu sadece asagıdakı kosulun gerceklesmesi ıcın atadıgımız deger kullanıcıdan aldıgımız sayıyı etkılemıyor
        int toplam=0;
        while (sayi!=0){
            System.out.println("lutfen bir sayı giriniz");
             sayi= scan.nextInt();
             toplam+=sayi;
        }

        System.out.println("sayıların toplamı: "+toplam);
    }
}