package day_23multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_MDA {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String arr[]=cumle.split(" ");
        System.out.println("Girdiginiz cumledeki kelime sayisi : " + arr.length);
    }
}
 //arr1[1]="Esila";