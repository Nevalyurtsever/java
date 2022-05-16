package day_17forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        //verilen iki harf ve aralarındakı harflerı yazdıran bir kod yazınız

        char ilkHarf = 'c';
        char sonHarf = 's';

        for (char i = ilkHarf; i <= sonHarf; i++) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
        double baslangıc=10;
        double bitis=20;
        double artıs=0.2;

        for (double i = baslangıc; i <=bitis; i+=artıs) {
            System.out.print(i+" ");
        }

    }
}
