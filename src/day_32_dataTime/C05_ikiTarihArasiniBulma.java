package day_32_dataTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {

    public static void main(String[] args) {


        LocalDate Bugun = LocalDate.now();

        LocalDate dogumgunu = LocalDate.of(1997, 10, 13);

        System.out.println(Period.between(dogumgunu,Bugun));//P24Y5M18D

        System.out.println(Period.between(dogumgunu,Bugun).getYears());//24


    }
}