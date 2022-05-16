package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftanınGunlerıIfElseIf {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanıcı gun ısmını yanlıs girerse yanlıs gırıs yazdırın
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ısmını yazınız");
        String gunIsmı = scan.next().toLowerCase();

        if (gunIsmı.equals("pazar") || gunIsmı.equals("cumartesi")){
            System.out.println("Gırdıgınız Gun Haftasonu");

        } else if (gunIsmı.equals("pazartesi")||gunIsmı.equals("sali")||gunIsmı.equals("carsamba")||gunIsmı.equals("persembe") ||
                gunIsmı.equals("cuma")){
            System.out.println("Gırdıgınız Gun Hafta Icı");
        }else{
            System.out.println("lutfen Gunu Dogru Gırınız");
        }
        //eger if else if.. statement else ile bitiyorsa
        //olasılıklardan sadece bir tanesi mutlaka calısır
        //java ilk buldugu true a ait sonucu yazdırır
        //ve kalan sartlara bakmaz

        //if else if.. cumleleri else ile bitmese de calısır
        //ancak bu durumda sadece bir olaılık calısabılır veya hic bir islem yapılmayabilir
    }
}