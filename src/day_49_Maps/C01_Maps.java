package day_49_Maps;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);
        list.set(1, (Integer) list.get(1) + 10);

        Map<Integer, String> sınıfList = new HashMap<>();
        //bir sınıfta ogrencı no ısım soy ısım ve brans olarak map olusturmak ıstıyoruz
        //key tek bır unique degerdir
        //ama value/deger birden fazla bilginin birlesiminden olusabılır
        //bu durumda daha sonra ıstedıgımız bılgılere dogru sekılde ulasabılmek ıcın
        //tum elementler ıcın value aynı bıcımde olusturulmalıdır
        sınıfList.put(101,"Ali, Can, Dev");
        sınıfList.put(102,"Veli, Yan, QA");
        sınıfList.put(103,"Ali, Yan, Dev");
        System.out.println(sınıfList);

        System.out.println(sınıfList.values());//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, Dev]

        System.out.println(sınıfList.keySet());//[101, 102, 103]


    }
}
