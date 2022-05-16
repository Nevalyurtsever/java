package day_39_overriding;

public class Toyata extends  Araba{

    String hız = "Toyata araclar max 220 km hız yapar";
    String marka = "Toyata";
    String sirketMerkezi = "Japonya";


    public void motor() {
        System.out.println("Toyata arabalar toyata marka motor kullanırlar ");
    }


    public  void garanti(){
        System.out.println("Toyata araclar 10 yıl garantılıdır");
    }

}
