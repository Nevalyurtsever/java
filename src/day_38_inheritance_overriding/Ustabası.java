package day_38_inheritance_overriding;

public class Ustabası extends Iscı {
    String statu = "Ustabası";
    String haklar = "Ustabası haftada bırgun ekstra tatıl hakkına sahiptir";

    public void mesai() {
        System.out.println("Arıza varsa Ustabası eksta ucret almadan calısır");
    }

    public void maasHesapla() {
        System.out.println("Ustabası 30 gun * 8 saat*10 euro= " + (30 * 8 * 12) + " Euro maas alır");
    }

    public static void main(String[] args) {
        /* Icınde oldugumuz classtan klasık halıyle bir obje olusturursak o obje ile cagırdıgımız
        variable ve methodlarda java once ıcınde bulundugumuz class a bakar aradıgımız class uyesı ıcınde oldugumuz
        classta varsa bıze onu getirir yoksa parent classlara bakar ,ilk buldugunu getirir

         */

        Ustabası yasin = new Ustabası();
        System.out.println(yasin.statu);//Ustabası
        System.out.println(yasin.haklar);//Ustabası haftada bırgun ekstra tatıl hakkına sahiptir
        System.out.println(yasin.ikramiye);//ıscıler yılda bır ıkramıye alır
        System.out.println(yasin.izin);//tum personel yılda 4 hafta ızın kullanabılır
        yasin.maasHesapla();
        yasin.mesai();
        /*Eger ıscı olarak ozellıklerini gormek ıstersek
       class adını(Data turu) seceriz */

        Iscı ahmet = new Ustabası();
        System.out.println(ahmet.statu);//Iscı
        System.out.println(ahmet.haklar);//Tum ıscıler Kıdem tazmınatı alırlar
        System.out.println(ahmet.ikramiye);//ıscıler yılda bır ıkramıye alır
        System.out.println(ahmet.izin);//tum personel yılda 4 hafta ızın kullanabılır
        ahmet.maasHesapla();
        ahmet.mesai();
        //Siz bir objeyi hangi classtan tanımlarsanız o class a aıt ozellıklere sahip olur
        //
        Personel adem = new Ustabası();
        System.out.println(adem.statu);//Personel
        System.out.println(adem.haklar);//Tum personel esıt haklara sahiptir
        System.out.println(adem.izin);//tum personel yılda 4 hafta ızın kullanabılır
        adem.maasHesapla();
        adem.mesai();
        //System.out.println(adem.ikramiye);//Cte verir

        /*
        Personel adem=new Ustabası(); bu bır ustabası objesıdır
        ile Personel adem=new Personel(); bu Personel objesidir

         */

        /*
        Personel adem=new Ustabası();
        Ustabasının personel olrak ozellıklerını ogrenmek ıstıyorum

        adem'ın data turu Personel'dir.
        Boylece bız adem'ı ne olarak ısımlendırdıgımızı bilebiliriz
        Ancak ben adem'ın ustabası oldugunu bılıyorum cunku constructor ı ustabası
        ama bu olusturma formatı ıle Adem ın tum personel ıle bırlıkte sahıp
        oldugu ortak ozellıklerı vurgulamak ıstıyorum

        Bu kullanım seklinde olusturulan obje data turu olarak secılen class ve onun parent classlarındakı
        variable ları kullanabılır

         */


    }
}
