package day_25_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class odev1 {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsız(sayilar);

    }

    private static void tekrarsız(List<Integer> sayilar) {
        List<Integer> tekrarsız = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsız.contains(sayilar.get(i))) {
                tekrarsız.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsız);

    }
}
