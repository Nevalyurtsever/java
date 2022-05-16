package day_52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodları {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("H", 3);
        myMap.putIfAbsent("K", 5);
        /*
        bir ekleme yapmak istedigimizde key daha once eklenmemısse map a eklensın
        daha onceden eklenmısse eskiyi silmemek ıcı bizi uyarsın
        eger hıc yoksa null doner
         */


        System.out.println(myMap.putIfAbsent("A", 6));//null
        if (myMap.putIfAbsent("K", 20) != null) {
            System.out.println("girdiginiz Key Mapte zaten var");
        }
        //   System.out.println(myMap.putIfAbsent("K",20));//5
        System.out.println(myMap);//{A=6, H=3, K=5}
        myMap.put("A", 10);
        System.out.println(myMap);//{A=10, H=3, K=5}
        myMap.computeIfAbsent("A", v -> 20); //A onceden oldugu ıcın degistirmeyecek
        System.out.println(myMap);
    }
}
