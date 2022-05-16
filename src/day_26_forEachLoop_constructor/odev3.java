package day_26_forEachLoop_constructor;

public class odev3 {
    public static void main(String[] args) {
        //bir string olusturunuz bu stringdeki karakterleri for each loop kullanarak yazınız
        //ipucu:split

        String isim="neval";
       String arr[]=isim.split("");
       String toplam="";
        for (String each:arr){

             toplam+=each+" ";

        }
        System.out.println(toplam);
    }
}
