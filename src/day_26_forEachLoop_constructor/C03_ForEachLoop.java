package day_26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
     /*   iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
                Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
       */

        String array1[]={"Ali","Ayse","Can","Fatma"};
        String array2[] ={"Can","Evren","Emsal","Fatma","Emre"};

        List<String> ortakElemanlar=new ArrayList<>();
        for (String each1:array1){
            for (String each2:array2)
                  {
                if (each1.equals(each2)){// each 1 ın getirdigi element each2 ye esitse listeme ekliyorum
                    ortakElemanlar.add(each1);
                }
            }

        }
if (ortakElemanlar.isEmpty()){
    System.out.println("ortak eleman yok");
}else {
    System.out.println("ıkı arraydeki ortak elemanlar "+ ortakElemanlar);
}

    }
}
