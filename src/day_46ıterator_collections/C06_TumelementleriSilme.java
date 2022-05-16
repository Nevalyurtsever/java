package day_46ıterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C06_TumelementleriSilme {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 artirin
        List<Integer> liste= new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        Iterator itr=liste.iterator();
        while (itr.hasNext()){
           itr.next();
           itr.remove();
        }
        System.out.println(liste);
    }
}
