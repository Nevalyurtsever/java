package day_17forLoop;

public class odev2 {
    public static void main(String[] args) {
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        int sayi = 5; //120
        System.out.println(faktoriyel(sayi));


    }

    private static int faktoriyel(int sayi) {
        int toplam = 1;
        for (int i = sayi; i >= 1; i--) {
            toplam *= i;

        }

        return toplam;
    }
}
