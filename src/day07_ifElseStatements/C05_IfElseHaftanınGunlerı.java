package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftanınGunlerı {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ısmını yazınız");
        String gunIsmı=scan.next().toUpperCase();


        if (gunIsmı.equals("PAZAR") || gunIsmı.equals("CUMARTESİ")){
            System.out.println("Gırdıgınız Gun Haftasonu");
        }else {
            System.out.println("girdiginiz gun hafta ıcıdır");
        }
    }
}
