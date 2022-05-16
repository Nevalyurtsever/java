package day_48_Collection;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str="Java cok guzel";//481588044
        System.out.println(str.hashCode());

        String str2="Hava cok guzel";//529529206
        System.out.println(str2.hashCode());

        Set<Integer> sayıKumesi=new HashSet<>();
        System.out.println(sayıKumesi.hashCode());//0
        sayıKumesi.add(10);
        System.out.println(sayıKumesi.hashCode());//10
        sayıKumesi.add(20);
        System.out.println(sayıKumesi.hashCode());//30


    }
}
