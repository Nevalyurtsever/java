package day_50_Maps;

import day_49_Maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        //sınıftakı ogrencı lıstesını duzenlı olrak yazdıralım

        Map<Integer, String> sınıfListMap = MapOlustur.myMap();
        System.out.println(sınıfListMap);
//bu kadar mucadeleyi tek tek ındexle keylere ulasmak ıcın maptekı keylerı alıp ındexı destekleyen liste atarım
        //eger keylere tek tek ulasmak ıstersek ındex yapısına ıhtıyıacımız var ancak map index yapısını desteklemez
        //bunun ıcın keylerı once bir sete sonrada setin tum elementlerini bir liste ekledik


        Set<Integer> sınıfKeySeti = sınıfListMap.keySet();
        System.out.println(sınıfKeySeti);
        List<Integer> keyList = new ArrayList<>();

        keyList.addAll(sınıfKeySeti);
        System.out.println(keyList);//artık ındex yapısını destekliyor
        System.out.println(keyList.get(2));//indexi 2 olan key ı verir

        //sımdı de value ları ındex ile ulasabılegumuz
        Collection<String> sınıfValueColl = sınıfListMap.values();
        System.out.println(sınıfValueColl);
        System.out.println(sınıfValueColl.size());

        List<String> sınıfValeuList = new ArrayList<>();
        sınıfValeuList.addAll(sınıfValueColl);

        System.out.println(sınıfValeuList.size());//ama yine 3 elementli..
        //her bir value birden fazla bilggiyi iceriyoronun ıcın valuelerı multıdimensional bir array a atmak mantııklı duruyor
        // ancak mMDA olusturmak ıcın boyutları bılmeye ıhtiyacımız var
        int outerArrayBoyut=sınıfValeuList.size();
        System.out.println(outerArrayBoyut);

        //iner arraylerın boyutunu bulmak biraz dahakomplex
        String ilkValue=sınıfValeuList.get(0);
        System.out.println(ilkValue);
        String ilkValuearr[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValuearr.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[] =sınıfValeuList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {

               valueMDArr[i][j]=temp[j];
            }
        }
        //bu satıra kadar keylerı ındex ile ulasabıldıgımız keyList e atadım
        //valuelerı MDA
        System.out.println(Arrays.deepToString(valueMDArr));
        int dısArrayuzunluk=sınıfValeuList.size();
        System.out.println(dısArrayuzunluk);



        }
    }



