package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan yarıcap ısteyip cemberin cevresı ve alanını yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap=scan.nextDouble();


        System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("dairenin alani  : " + 3.14*yaricap*yaricap);
        scan.close();
    }
}
