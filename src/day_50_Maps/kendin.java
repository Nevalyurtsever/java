package day_50_Maps;

import day_49_Maps.MapOlustur;

import java.util.*;

public class kendin {
    public static void main(String[] args) {
        Map<Integer, String> sınıfListMap = MapOlustur.myMap();//diger slaytta olsuturdugumuz mapi yeni mapimize atadık(*hem key var hem value*)

        //eger keylere tek te ulasmak ıstersek ındex yapısına ihtiyacımız var ancak map index yapısını desteklemez bunun ıcın keylerı once bir sete
        //sonrada setin tum elementlerını bir list e ekledık
        Set<Integer> sinifKeySeti = sınıfListMap.keySet();//yeni mapimizdeki  sadece keyleri setimize atadık
        List<Integer> keyList = new ArrayList<>();//yeni bir list olusturduk
        keyList.addAll(sinifKeySeti);//yeni olusturdugumuz liste  atadık...
        System.out.println(keyList);//artık index yapısını destekliyor
        System.out.println(keyList.get(1));//102

        //sımdi de valurlerı index ile ulasabılecegımız bir sekle sokalım
        Collection<String> sınıfValueColl =sınıfListMap.values();
        System.out.println(sınıfValueColl);//[Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, Dev]
        System.out.println(sınıfValueColl.size());//3
        List<String> sınıfValueList=new ArrayList<>();
        sınıfValueList.addAll(sınıfValueColl);

        int outerArrayBoyut= sınıfValueColl.size();
        String ilkValue=sınıfValueList.get(0);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

String valueMDArr[][]=new  String[outerArrayBoyut][innerArrayBoyut];
        for (int i = 0; i <outerArrayBoyut ; i++) {
           String temp[]=sınıfValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

valueMDArr[i][j]=temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));//[[Ali, Can, Dev], [Veli, Yan, QA], [Ali, Yan, Dev]]



    }
}

