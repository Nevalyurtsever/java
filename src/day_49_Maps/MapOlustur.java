package day_49_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer, String> myMap() {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(101, "Ali, Can, Dev, 1453");
        myMap.put(102, "Veli, Yan, QA, 1990");
        myMap.put(103, "Ali, Yan, Dev, 2000");
        myMap.put(104, "Ayse, Kaan, C#, 2001");
        myMap.put(105, "Fatma, Han, Java, 2002");

        return myMap;
    }
}
