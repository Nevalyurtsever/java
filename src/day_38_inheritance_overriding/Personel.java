package day_38_inheritance_overriding;

import java.net.ServerSocket;

public class Personel {

    public String statu = "Personel";
    public String haklar = "Tum personel esıt haklara sahiptir";
    public String izin = "tum personel yılda 4 hafta ızın kullanabılır";

    public void mesai() {
        System.out.println("Tum personel 5 gun gunde 8 saat calisır");
    }

    public void maasHesapla() {
        System.out.println("Tum personel 30 gun * 8 saat*10 euro= " + (30 * 8 * 10) + " Euro maas alır");
    }
}
