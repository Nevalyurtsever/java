package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        //kullanıcıdan yasını ısteyın
        //65 veya daha buyukse emeklı olabılırsın
        //65 'ten kucukse emeklı olamazsın yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabılırsın");
        }
        else{
            System.out.println("emeklı olamassın");
            System.out.println(65-yas+" sene daha calısmalısın");
      }
        //ıf else statement'larda iki durumdan sadece ve sadece biri calısır
        // ikisinin birden calısma ıhtımalı===>yok
        //ikisinin de calısmama ihtimali ====>yok

    }
}
