package day_52_maps;

import day_49_Maps.MapOlustur;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class C01_EnrySet {
    public static void main(String[] args) {
       Map<Integer,String> sınıfListMap= MapOlustur.myMap();
        /*
        myMap entrySet(); methodu  bize eentrylerden olusan bir set dondurur
        Eger bu entrylrtı manıpule etmek ıstıyorsak
        methodun dondurdugu set ı yenı bır set olusturup store etmelıyiz

         */
   System.out.println("map: "+sınıfListMap);//{}
      System.out.println(sınıfListMap.entrySet());//[]
        //entrySet olusturup onu sete atadık
        Set<Map.Entry<Integer,String>> sınıfEntrySet =sınıfListMap.entrySet();
        System.out.println("No  İsim    Soyİsim  Brans  D.yılı");
        int toplam=0;
        for (Map.Entry<Integer,String> each:sınıfEntrySet) {
       Integer entryKey=each.getKey();
       String valueStr=each.getValue();
toplam+=each.getKey();

       String valueArr[]=valueStr.split(", ");
            System.out.printf("%-4d %-6s %-9s %-6s %s\n",entryKey,valueArr[0],valueArr[1],valueArr[2],valueArr[3]);

        }
        System.out.println("toplam = " + toplam);
    }
}
