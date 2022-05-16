package day_32_dataTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm= LocalTime.now();
        System.out.println(tm);//22:16:08.526034200


        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        LocalTime tmSonrası= LocalTime.now();
        System.out.println(tmSonrası);//22:16:08.527033500


        // bir islemin ne kadar surede bittigini bulmak istersek
        // islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz
        double nano1=tm.getNano();
        double nano2=tmSonrası.getNano();
        System.out.println("ıslem "+ (nano2-nano1)+ " nanosaniyede bitti");

        //ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000)); //14:59:53.688752500  (bundan 100 dk sonra)

        // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
