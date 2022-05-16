package day_17forLoop;

public class odev3 {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve Stringi tersine ceviren
        //   bir method yazin.
        String isim = "fatih";

        cevir(isim);

    }

    private static void cevir(String isim) {
        String ekle = "";
        for (int i = isim.length() - 1; i >= 0; i--) {
            ekle += isim.substring(i, i + 1);
        }
        System.out.println("tersten yazılıs: " + ekle);

    }
}
