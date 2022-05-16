package day_38_inheritance_overriding;

public class Iscı extends Personel {
   public String statu = "Iscı";
   public String haklar = "Tum ıscıler Kıdem tazmınatı alırlar";
  public   String ikramiye = "ıscıler yılda bır ıkramıye alır";

    public void mesai() {
        System.out.println("Tum ıscıler haftalık 400 saat calısır");
    }

    public void maasHesapla() {
        System.out.println("Tum ıscıler 30 gun * 8 saat*11 euro= " + (30 * 8 * 11) + " Euro maas alır");
    }

}
