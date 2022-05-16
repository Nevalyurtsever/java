package day08_ifElseİfStatements;

import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {
        //Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
        //Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin..

        Scanner scan=new Scanner(System.in);
        System.out.println("Lufen Sifre Giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk<='Z'){
          if (krk=='A'){
              System.out.println("Gecerli Sifre");
          }else {
              System.out.println("Gecersiz Sifre");
          }
        }else if(krk>='a' && krk<='z'){
            if (krk=='z'){
                System.out.println("Gecerli Sifre");
            }else {
                System.out.println("Gecersiz Sifre");
            }
        }else {
            System.out.println("lutfen harf giriniz");
            }






    }
}
