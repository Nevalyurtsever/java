package day_49_Maps;

import java.util.ArrayList;
import java.util.List;

public class Odev {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

list.set(1,(Integer)list.get(1)+10);
list.set(2,(Double)list.get(2)+15);
        System.out.println(list);
    }
}
