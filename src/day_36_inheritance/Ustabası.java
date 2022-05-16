package day_36_inheritance;

public class Ustabası extends Isci {


    public static void main(String[] args) {
        Ustabası ustabası1=new Ustabası();
        ustabası1.saatUcreti=15;
        ustabası1.isim="murat";
        ustabası1.soyisim="Gokcek";
        ustabası1.maas=ustabası1.maasHesapla();
        ustabası1.statu="Isci";
        ustabası1.IsciStatu="Ustabası";
        System.out.println(ustabası1);

    }
    public String toString() {
        return "Ustabası{" +
                "IsciStatu='" + IsciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
