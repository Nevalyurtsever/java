package day_48_Collection;

import java.util.HashSet;
import java.util.Set;

public class C01 {
    public static void main(String[] args) {
        // verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturun
        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        Set<Integer> set=new HashSet<>();
        for (Integer each:arr) {
            set.add(each);
        }
        System.out.println(set);
    }
}
