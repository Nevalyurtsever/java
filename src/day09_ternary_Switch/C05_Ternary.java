package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //bazen ternary dekı ıkı sonucun data turlerı farklı olabılır
        //verilen sayı 100 den buyukse sayının karesini alıp yazdıran
        //100 den kucukse sayı 100 den buyuk olmalı yazdıran bir ternary olusturalım

        int sayi=150;
        //ternary bize sonuc getirdiginden ya sonucu direk yazdırmalıyız
        //veya bir degiskene atamalıyız
        //eger sonuclar farklı data turlerınde ıse
        //atama yapacagımız variable ın data turu tek olacagından
        //atama yapamayız
        //sadece direkt yazdırabılırız

        System.out.println( sayi>100 ? sayi*sayi :"sayi 100 den buyuk olmalı");

    }
}
