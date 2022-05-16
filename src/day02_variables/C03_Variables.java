package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {


String ogrenciIsmi="Melih";
ogrenciIsmi="Furkan";

// bir varable declare edildikren sonra istedigimiz kadar deger degisimi yapabiliriz
//ancak declare edilen bir variable tekrar declare edilemez

//String ogrenciIsmi="Abdullah";

  String isim,soyisim,dogumYeri; //declaratıon
  isim="nihal"; //deger atama
  soyisim="ozel";
  dogumYeri="ankara";
        System.out.println(isim+" "+ soyisim +" " + dogumYeri);
   String tcNo="12345678912";
String hiclık="";
        //String nonprimitive oldugu ucun bız sadece data saklamak ıcın degıl
        //ekstra bazı ozelliklerı de kullanabılıyoruz
        //eger tcno, okul numarası veys tel numarası gıbı
        //kendisi sayısal olan ancak matematiksel bir islemde kullannılmayan
        //degerler ıcınde string kullanılabılır

        String harf="A";
        char harf2='A';
        //bu ıkısı ıcınde aynı durum gecerlı
        //ben a harfı ıcın bir varieble char olarakda olusturabılırım String olarakta olusturabılrım
        //eger sadece saklayacaksak char kullanılabılır ama
        //String ın ozellıklerınden istifade etmek ıcın strıng olarak tanımlamak daha avantajlı olabılır
    }
}
