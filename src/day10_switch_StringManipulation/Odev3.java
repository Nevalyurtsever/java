package day10_switch_StringManipulation;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //kullanıcıdan SDET kısaltmasındaki harflerden birini yazmasını isteyin kullanıcı
        //S girerse Software
        //D ===>Developer
        //E==>Engineer
        //T==> In Testıng

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen SDET kısaltmasındakı harflerden birini yazınız");
        char harf=scan.next().toUpperCase().charAt(0);

        switch(harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case  'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testıng");
                break;
            default:
                System.out.println("Lutfen kısaltmadakı harflerden birini giriniz");
        }
    }
}
