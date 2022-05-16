package day_50_Maps;

import day_49_Maps.MapOlustur;

import java.util.*;

public class Odev {
    //sınıftakı ogrenci listesini duzenli olarak yazdıralım
    public static void main(String[] args) {
        Map<Integer, String> sınıfListMap = MapOlustur.myMap();
        System.out.println(sınıfListMap);//{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, Dev}
        //bu kadar mucadeleyi tek tek ındexle keylere ulasmak ıcın maptekı keylerı alıp ındexı destekleyen liste atarım
        //eger keylere tek tek ulasmak ıstersek ındex yapısına ıhtıyıacımız var ancak map index yapısını desteklemez
        //bunun ıcın keylerı once bir sete sonrada setin tum elementlerini bir liste ekledik
        Set<Integer> sınıfKeySeti = sınıfListMap.keySet();//mapteki key degerlerini  once sete atadım
        //setteki tum elementleri al bir  liste ata...
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sınıfKeySeti);//sette olan keyleri listimize atadık
        System.out.println(keyList);//[101, 102, 103] artık index yapısını destekliyor
        System.out.println(keyList.get(1));//102

        //Eger keylere tek tek ulasmak ıstersek index yapısına ıhtıyac var ancak map index yapısını desteklemez bunun
        // ıcın keyleri once sete sonrada setın tum elementlerını bir liste atadık
        // sımdi de valulerı index ile ulasabılecegımız bir sekle sokalım

        Collection<String> sınıfValueColl = sınıfListMap.values();//value lerı collectıona atadık keylerı sete
        System.out.println(sınıfValueColl);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, Dev]

        System.out.println(sınıfValueColl.size()); //3
        //once collectionstakileri bir liste ekleyelim

        List<String> sınıfValueList = new ArrayList<>();
        sınıfValueList.addAll(sınıfValueColl);
        System.out.println(sınıfValueList);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, Dev] //3 elementlı
        /*
        her bir value birden fazla bilgiyi iceriyor
        onun ıcın valuelerı MDA  bir array a atmak mantıklı duruyor
        ancak MDA olusturmk ıcın boyutları bılmeye ıhtıyacımız var
        int
         */
        int outerArrayBoyut = sınıfValueList.size();
        System.out.println(outerArrayBoyut);
        //inner arrayların boyutunu bulmak biraz daha komplex olacak
        String ilkValue = sınıfValueList.get(0);
        System.out.println(ilkValue);//Ali, Can, Dev
        System.out.println(ilkValue.length()); //iste asagıdaki nested forda 13 elemntlı yanı tek gozuken i ali can dev diye ayırıyoruz
        String ilkValueArray[] = ilkValue.split(", ");
        System.out.println(Arrays.toString(ilkValueArray));//[Ali, Can, Dev]
        System.out.println(ilkValueArray.length);//artık eleman sayısı 3

        int innerArrayBoyut=ilkValueArray.length;

        String valueMDA[][]=new String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=sınıfValueList.get(i).split(", ");//yukarıdada array a atamıstık
            System.out.println(Arrays.toString(temp));

            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDA[i][j]=temp[j];
                System.out.println(temp[0]);//ali

            }
        }
        System.out.println(Arrays.deepToString(valueMDA));//[[Ali, Can, Dev], [Veli, Yan, QA], [Ali, Yan, Dev]]

        //keyler index le ulasabıldıgım sınıf keylist e atadım
        //vlauelerı mda

    }
}
