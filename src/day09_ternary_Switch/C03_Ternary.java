package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayi=1400;
        String sonuc= sayi>=100 ? "sayı 3 basamaklı veya daha buyuk":"sayi negatif veya 3 basamaktan daha kucuktur";

        //Ternary bize sonuc dondurdugu ıcın
        //ya bu sonucu direkt yazdırmalıyız
        //yada sonucun data turune uygun bir variable 'a atama yapabilriz

        System.out.println(sonuc);

    }
}
