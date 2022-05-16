package day04_dataCasting_Increment;

public class odev1 {
    public static void main(String[] args) {

        //byte data tipinde bir degisken olusturun short int float ve double data tiplerınde birer degisken olusturup
        //adım adım widening yapıp yazdırın
        byte sayi1=22;

        short sayi2=sayi1;
        int sayi3=sayi2;
        float sayi4=sayi3;
        double sayi5=sayi4;

        System.out.println(sayi2+" "+sayi3+" "+sayi4+" "+sayi5);
    }
}
