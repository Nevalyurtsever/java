package day04_dataCasting_Increment;

public class odev2 {
    public static void main(String[] args) {
        //int data turunde bir degisken olusturun ve adım adım narrowing yapıp yazdırın

        int sayi1=200;
        short sayi2=(short)sayi1;//200
        byte sayi3= (byte)sayi2;//-56
        System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2+" sayi3: "+sayi3);
    }


}
