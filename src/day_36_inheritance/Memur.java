package day_36_inheritance;

public class Memur extends Muhasebe {
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Memur memur1=new Memur();
        //memur 1 objesı Memur classının objesı olmasına ragmen inherit ettigi muhasebe ve onun da parent ı olan personel
        // classlarındakı tum dataları alabılır

        //personel class'ından
        memur1.persNo=1001;
        memur1.isim="ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="5303991697";

        //Muhasebe class'ından
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);


        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);


    }
}
