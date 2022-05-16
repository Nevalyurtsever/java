package day_23multiDimensionalArrays;

public class odev1 {
    public static void main(String[] args) {
     //tum elemanlarıın carpımını ekrana yazdıran bır method yazınız
        int arr[][]={{1,2,3},{4,5,6}};
        int carpım=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpım*=arr[i][j];
            }
        }


        System.out.println("Sayıların carpımı: "+carpım);

    }
}
