package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";
        // biz string methodlarını arka arkaya kullanabılırız
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdıralım

        //str.charAt(5)  ; boyle yazdıgımızda sonuc artık Strıng degıl char olacaktır
        //dolayısıyla Stringte yapmak ıstedigimiz tum degisiklkleri once yapıp sonra charAt() methodunu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}