package day_33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //paremetre olarak bir int ve istedigimiz kadar String alan en uzun kelimenin harf sayısı ıle paremetre degerini
        //carpıp sonucu yazdıran method olusturun

        int sayi = 5;
        String str1 = "zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        carpım(sayi, str1, str2, str3);
        //bir methotta varargs dısında paremetre kullanacaksak once diger paremetreleri yazıp varargs'ı en sona yazmalıyız
        //bu sebeple bir methotta birden fazla varargs olamaz.
    }

    private static void carpım(int sayi, String... str) {
        String enUzunStr = "";
        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("ıstenen deger: " + sayi * enUzunStr.length());


    }
}
