package day_23multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
// verilen bir array'e yeni bir element ekleyen bir method olusturun
        int arr[]={1,2,3,4};
        int eklenecekEleman=5;

        int yeniArr[]=new int[arr.length+1];
        System.out.println(Arrays.toString(yeniArr));//[0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        System.out.println(Arrays.toString(yeniArr));//[1, 2, 3, 4, 0]

        yeniArr[yeniArr.length-1]=5;
        System.out.println(Arrays.toString(yeniArr));
    }
}
