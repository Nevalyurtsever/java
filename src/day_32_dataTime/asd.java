package day_32_dataTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class asd {
    public static void main(String[] args) {
        // tarih
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.plusDays(120));
        LocalDate dogum=LocalDate.of(1997,10,13);

        //zaman
        LocalTime saat=LocalTime.now();
        System.out.println(saat.getNano());
        System.out.println(saat.toString());//strin ozellikleri

    }
}
