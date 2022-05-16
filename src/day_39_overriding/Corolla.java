package day_39_overriding;

public class Corolla extends Toyata {

    protected String hız = "Corolla  max 220 km hız yapar";

    protected String yakıt = "Corolla benzinli veya elektriklidir";

    protected String model = "Corolla";

    public void motor() {
        System.out.println("Toyata arabalar toyata marka motor kullanırlar ");
    }

    public void yakıtTuketimi() {
        System.out.println("Corolla 5.6 L yakıt tuketır");
    }

    public void vitesSyisi() {
        System.out.println("Corolla 5 vitesliir");
    }

    public static void main(String[] args) {

 /*
 Data turu ve constructor farklı oldugunda constructor calıstıgı ıcın obje Constructor'ın oldugu
 class ozellıklerını tasır ancak data turu parent class secildigi ıcın varıablelar data turunun secildigi class
 ve onun parent classlarından deger alabılır.
 Methodlar ıcın ıse yine data turunun oldugu classa gideriz ancak direk method u
 calıstırmadan once method Override edilmis mi diye kontrol edelim
  */

        Corolla araba1 = new Corolla();
        System.out.println(araba1.hareket);//araba
        System.out.println(araba1.hız);//Corolla
        System.out.println(araba1.yakıt);//Corolla
        System.out.println(araba1.marka);//Toyata
        System.out.println(araba1.sirketMerkezi);//Toyata
        System.out.println(araba1.model);//Corola
        araba1.motor();//Corolla

        Toyata araba2 = new Corolla();
        System.out.println(araba2.hareket);//araba
        System.out.println(araba2.hız);//Toyata
        System.out.println(araba2.yakit);//Araba
        System.out.println(araba2.marka);//Toyata
        System.out.println(araba2.sirketMerkezi);//Toyata
        //System.out.println(araba2.model);//CTE
        araba2.motor();//Corolla
        araba2.garanti();//Toyata
        araba2.yakıtTuketimi();//Corolla
        //araba2.vitesSayisi();//data tutu olan toyata dan baslayınca boyle bır method bulamadık dolayısıyla CTE


        Araba araba3 = new Corolla();
        System.out.println(araba3.hareket);//araba
        System.out.println(araba3.hız);//araba
        System.out.println(araba3.yakit);//Araba
        System.out.println(araba3.marka);//araba
        // System.out.println(araba3.sirketMerkezi);//CTE
        // System.out.println(araba3.model);//CTE
        araba3.motor();//corolla
        araba3.yakıtTuketimi();//corolla
        //araba3.garanti(); CTE aramaya araba classından basladı ve methodu bulamadı
        //araba3.vitesSayisi(); //CTE

    }
}