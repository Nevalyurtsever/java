package day03_Scanner;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        //kullanıcıdan karenın bir kenar uzunlugunu alın karenın cevresını ve alanını hesaplayın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin Bir Kenar Uzunlugunu Giriniz");
        int kenar=scan.nextInt();

       int kareCevre=4*kenar;
        int kareAlan=kenar*kenar;

        System.out.println("Karenin Cevresi: "+kareCevre);
        System.out.println("Karenin Alanı :"+kareAlan);

    }
}
