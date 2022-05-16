package day_23multiDimensionalArrays;

import java.util.Arrays;

public class odev2 {
    public static void main(String[] args) {
      /*  Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini

        birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
        yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13} */


        int arr[][]={{1,2,3},{4,5},{6,7}};

        int toplam[]=new int[arr.length]; // 3 elemanlı bir arr olusturduk
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam[i]+=arr[i][j];
            }
                           // 0 =>0 1 2
                           //  1=> 0 1
                           // 2 => 0 1
        }

        System.out.println(Arrays.toString(toplam));

    }
}
