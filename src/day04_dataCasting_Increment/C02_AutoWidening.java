package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;
       // String str=dogruMu; //sol String sag boolean olunca kabul etmiyor


        byte sayi1= 44;
        System.out.println(sayi1); //44

        short sayi2=sayi1; //esitligin solu short,sagı ise byte olmasına ragmen java itiraz etmıyor
                            //deger olarak atanan data turu variable data turunden kucuk kucuk old ıcın java sorun yapmaz
        System.out.println(sayi2); //44

      double sayi3=sayi2;
        System.out.println(sayi3);//44.0


    }
}
