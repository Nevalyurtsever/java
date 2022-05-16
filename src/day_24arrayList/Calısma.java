package day_24arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calısma {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]

        List<String> log = new ArrayList<>();
        // isimler.set(0,"ali");buna gerek yok cunku zaten log a set yaparak ekledık
        // log.add(isimler.set(0,"veli"));
        log.add(isimler.set(0, "ali"));//[ali, veli, Ilker, Oguzhan]
        log.add(isimler.set(1, "veli"));
        System.out.println(isimler);//[ali, veli, Ilker, Oguzhan]
        System.out.println(log);//[Aykut, Yusuf]

        List<String> hayvanlar=new ArrayList<>();
        hayvanlar.add("kus");
        hayvanlar.add("zurafa");
        hayvanlar.add("fil");
        System.out.println(hayvanlar);//[kus, zurafa, fil]
     //   hayvanlar.add(4,"bocek"); // olmayan bir indexe add yapamayız
      // hayvanlar.add(3,"bocek");
        System.out.println(hayvanlar);//[kus, zurafa, fil, bocek]
//hayvanlar.set(4,"kelebek"); aynı sekilde olmayan bir index i degistiremeyiz
//[kus, zurafa, fil, bocek]
        List<String> kova=new ArrayList<>();
      kova.add(hayvanlar.set(0,"aygır"));
      kova.add(hayvanlar.remove(1));// log a ekle derken sette hem kovaya ekleriz hem degistiririrz removeda da icine index yazarsak evet ama
        //object kabul etmıyor
        System.out.println("" );
        System.out.println(hayvanlar);
        System.out.println(kova);


    }
}
