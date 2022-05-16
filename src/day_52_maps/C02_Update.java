package day_52_maps;

import day_49_Maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {

    // Verilen map'deki tum branslari Java yapalim
    /*
    mapte valur komplex olabıldıgı ıcın value ıcerisinden bir bolumu degistirmek istersek
    once value ya ulasmak sonra onu manıpule ederek istedigimiz degisikligi yapmak ve enson degismis halini map a eklemek gerekir
     */
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = MapOlustur.myMap();
       // System.out.println(sinifListMap);
        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();
        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            Integer keyEntry = each.getKey();
            String valueEntry = each.getValue();
            String valueArr[] = valueEntry.split(", ");

            String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", "
                    + valueArr[3];
           sinifListMap.put(keyEntry, valueYeni);
        }
        System.out.println(sinifListMap);
    }

}
