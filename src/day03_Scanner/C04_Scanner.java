package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Scanner kullanmak ıcın 3 adım takıp ediyoruz
        //1. adım kendimize bir scanner olusturmak

        Scanner scan=new Scanner(System.in); //esitligin sagında yenı bir scanner olusturulur
                                             //ve olusturulan bu scanner scan variableına assign edilir
                                             //scan variable'ın ısmıdır ,istedigimiz ismi verebiliriz

        //2. adım :Kullanıcıdan istedigimiz degeri girmesi icin acıklayıcı bilgi yazdırın
        System.out.println("lutfen isminizi giriniz");
        //3. adım kullanıcının girdigi degeri uygun bir variable olusturup kaydedın

        //String kullanıcıİsmi=scan.next();//sadece ilk kelimeyi alır(ilk space a kadar olan bolumu alır)
        String kullanıcıİsmi=scan.nextLine();//satır sonuna kadar girilen tum degerleri alır
        System.out.println("Kullanıcının Girdigi İsim: "+kullanıcıİsmi);
    }
}
