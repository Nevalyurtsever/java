package day_23multiDimensionalArrays;

import java.util.Arrays;

public class odev3 {
    public static void main(String[] args) {
        // Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        //   Array olarak yazdiran bir method yaziniz
        int arr[] = {1, 2, 3, 4, 5, 3};
        int istenenDeger = 3;

        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenenDeger) {
                sayac++;
            }
        }

        int yeniArr[] = new int[arr.length - sayac]; //yeni arr uzunlugu belirlendi [0,0,0,0]
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenenDeger) {
                yeniArr[index] = arr[i];
                index++;
            }//arr1[1]="Esila";
        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
