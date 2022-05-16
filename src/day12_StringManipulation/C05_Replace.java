package day12_StringManipulation;

public class C05_Replace {
    public static void main(String[] args) {
        String str="Bugun ne cok sey ogrendik";
        //bu cumledekı spaceleri yok edelım

        System.out.println("space haric karakter sayısı: "+str.replace(" ","").length());

        //atama yapılmadıgı surece orjınal string kalıcı olarak degısmez
        //sadece o satır ıcın degisiklik yapılıp sonuc yazdırılmıs olur

        System.out.println("orjinal str karakter sayısı: "+str.length());

        //str da kalıcı degısıklık yapalım
        str=str.replace("Bugun","yarın");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println(str);
    }
}
