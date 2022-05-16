package day04_dataCasting_Increment;

public class odev4 {
    public static void main(String[] args) {
        //double 255.36 sayısını int a ve sonrada olusturdugunuz ınt sayıyı byte a cevirip yazdırın
        double sayi1=255.36;
        int sayi2= (int)sayi1;
        System.out.println(sayi2);//255
        byte sayi3=(byte) sayi2;
        System.out.println(sayi3);//-1
    }
}
