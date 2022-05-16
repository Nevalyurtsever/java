package day_30_passByValue;

public class alıstırma {
    static double ucret = 12;

    public static void main(String[] args) {
        double odeme = 12;
        ucretarttır(odeme);
        ucretarttır(odeme);
        ucretarttır(odeme);
        System.out.println("son odeme: " + odeme);
        //odeme fiyatı 3 defada odeme methodunu kullandıysak bile degismedi ilk degerini aldı

        ucretarttır();
        ucretarttır();
        ucretarttır();
        System.out.println("son ucret " + ucret);
        // static ucret statıc oldugu ıcın her methoddda degisiklik kalıcı oldu  ve en son methodda yazdırınca sayı degisti


    }

    private static void ucretarttır(double odeme) {
        ucret = ucret + (ucret * (0.5));
    }

    private static void ucretarttır() {
        ucret = ucret + (ucret * (0.5));
    }
}
