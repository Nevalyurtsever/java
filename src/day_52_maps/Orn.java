package day_52_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Orn {
    public static void main(String[] args) {
        Map<Integer,String> gulbaharKoleji=new HashMap<>();
gulbaharKoleji.put(1,"neval, yurtsever, fen lisesi, 2010");
gulbaharKoleji.put(2,"damla, akbıyık, anadolu lisesi, 2011");
gulbaharKoleji.put(3,"Kamile, ercan, ogretmenl isesi, 2009");
      Set<Map.Entry<Integer,String>> gulbaharKolejıSet =gulbaharKoleji.entrySet();
        System.out.println("key:  isim:   soyısım:   lise:        yıl:");
        for (Map.Entry<Integer,String> each:gulbaharKolejıSet) {
            Integer KeySet=each.getKey();
            String valueSet=each.getValue();

            String valueArr[]=valueSet.split(", ");
            System.out.printf("%-4d %-8s %-9s %-6s %-5s\n",KeySet,valueArr[0],valueArr[1],valueArr[2],valueArr[3]);


        }

    }

}
