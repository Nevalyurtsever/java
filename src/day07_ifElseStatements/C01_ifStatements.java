package day07_ifElseStatements;

public class C01_ifStatements {
    public static void main(String[] args) {
        int a=2;
        int b=3;

       if (a==b){
           System.out.println("verilen sayılar esittir");
       }
        if (a>100){
            System.out.println("a yuzden buyuk");
        }
        if (a*b>1) {
            System.out.println("sayıların carpımı 5 ten buyuktur");
        }
        //bagımsız if cumleleri kendileri dısındakı kodlarla ılgılenmezler.
        //bir sart ve o sarta baglı sonuca odaklıdır.
        //birden fazla bagımsız ıf cumlesı oldugunda hepsinin body calısabılecegı gibi
        //hic birisinin body sı calısmayada bılır.

    }
}
