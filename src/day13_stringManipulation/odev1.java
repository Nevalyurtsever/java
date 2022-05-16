package day13_stringManipulation;

public class odev1 {
    public static void main(String[] args) {
        String cumle=" Java ogrenmek123 Cok guzel@ ";
        //"Java ogrenmek cok guzel." haline getiriniz

        cumle=cumle.replaceAll("\\d","");// Java ogrenmek Cok guzel@
        cumle=cumle.replaceAll("\\s","1");//1Java1ogrenmek1Cok1guzel@1
        cumle=cumle.replaceAll("\\W","");//1Java1ogrenmek1Cok1guzel1
        cumle=cumle.replace("1"," ");// Java ogrenmek Cok guzel
        cumle=cumle.replace("C","c");// Java ogrenmek cok guzel
        System.out.println(cumle);

    }
}
