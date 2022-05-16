package day_26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 11};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //bunu for-each loop ile yapacak olursak
        //for-each loop u calıstırmak ıcın hedef bir collection vermeliyiz
        for (int each : arr) {          //arr arrayıne git her bit integer ı bana getir
            System.out.print(each + " ");
        }

         //avantajı: index, baslangıc degeri bitis degerigibi detaylarla
        //ugrasmamıza gerek kalmadan collectıons dan tum elementlerı bize getirir
        //dezavantajı :index e baglı bir ıslem yapamayız

    }
}
