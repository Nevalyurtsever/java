package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaİciHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ısmını yazınız");
        String gunIsmı=scan.next().toLowerCase();//kullanıcı nasıl yazarsa yazsın biz kucuk harfe cevirir
        //String ifadelerde == kullanılması tavsiye edilmez
        //cunku bekledigimizden farklı sonuc verebilir

        if (gunIsmı.equals("pazar") || gunIsmı.equals("cumartesi")){
            System.out.println("Gırdıgınız Gun Haftasonu");
        }
        if (gunIsmı.equals("pazartesi")||gunIsmı.equals("sali")||gunIsmı.equals("carsamba")||gunIsmı.equals("persembe") ||
        gunIsmı.equals("cuma")) {
            System.out.println("Gırdıgınız Gun Haftaici");
        }


    }
}
