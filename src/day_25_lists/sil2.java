package day_25_lists;

import java.util.Arrays;

public class sil2 {
    public static void main(String[] args) {
        //********************ARRAY OLARAK*************************
        /*    * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4 */

        int input[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;
        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
        }
        int ortalama=toplam/input.length;

        int sayac=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]<=ortalama){
                sayac++;
            }
        }
        System.out.println(sayac); //
        int yeniInput[]=new int[input.length-sayac];
        System.out.println(Arrays.toString(yeniInput)); //[0, 0, 0]

        int index=0;
        for (int i = 0; i <input.length ; i++) {
            if (input[i]>ortalama){
                yeniInput[index]=input[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(yeniInput));
    }
}
