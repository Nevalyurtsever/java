package day_26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class odev2 {
    public static void main(String[] args) {
        //bir ınteger lıst olusturunuz ve bu lısttekı tum sayıların karesınn toplamını for each loop kullanarak bulunuz
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int toplam=0;
        for (Integer each:list){

            toplam+=each*each;
        }
        System.out.println("sayıların karelerının toplamı "+toplam);
    }
}
