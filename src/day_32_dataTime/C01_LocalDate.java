package day_32_dataTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now();//objenın olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh = LocalDate.of(1997, 10, 13);
        //ıstediginiz yıl ay ve gun degerlerine gore bıze obje olusturur.


        //get ' li methodlarla tarih ile ilgili detaylı bilgileri aiabiliriz
        System.out.println(trh);//2022-03-31
        System.out.println(trh.getDayOfMonth()); //31 ayın kacıncı gunu
        System.out.println(trh.getDayOfWeek());//THURSDAY haftanın kacıncı gunu
        System.out.println(trh.getMonthValue()); //3 ayın kacıncı gunu
        System.out.println(trh.getYear());//2022 yılı getir

        //bir tarihten istedigimiz kadar ileri veya geri gidebiliriz
        System.out.println(trh.minusWeeks(20)); //2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-21

        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10
        //ıstedigimiz ulkenın o andakı tarihini elde etmek ıstersek
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01
        //is ile baslayan methodlar boolean sonuclar dındurur
        System.out.println(LocalDate.now().isLeapYear());//false
        System.out.println(trh.isAfter(baskaTrh));//true bugunun tarıhı dogum tarıhımden sonra mı evet true;


    }
}
