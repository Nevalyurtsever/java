package day_52_maps;

import day_49_Maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_2 {
    public static void main(String[] args) {
        Map<Integer, String> sınıfyeniMap = MapOlustur.myMap();
        System.out.println(sınıfyeniMap);
        Set<Map.Entry<Integer, String>> entrySet = sınıfyeniMap.entrySet();
        System.out.println("No:   isim:   soyIsım:  Brans:   yıl: ");
        for (Map.Entry<Integer, String> each : entrySet) {
            Integer Key = each.getKey();
            String Value = each.getValue();

            String valueArr[] = Value.split(", ");
            System.out.printf("%-4d %-6s %-9s %-6s %-4s\n", Key, valueArr[0], valueArr[1], valueArr[2], valueArr[3]);
        }


    }
}
