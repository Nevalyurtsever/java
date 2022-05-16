package day_47_LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04 {
    // verilen bir array'den tekrar eden elementleri silip
    // unique elementler olusan bir array haline donduren bir method olusturun
    //oncelikle bir array olustur daha sonra tekrarsız olması ıcın bunları set e ata(otamatıkmen tekrarsız olur)
    //daha sonra yeni array olustur yeni array e benzersizleri ekle ama bunumethod olarak yap ve ilk olustrudugum variable a ata

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 2, 3, 4, 9};

arr=benzersiz(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static int[] benzersiz(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for (int each:arr) {
            set.add(each);
        }

        //yeni arr olusturalım
        int yeniarr[]=new int[set.size()];
        int index=0;
        for (Integer  each:set) {
            yeniarr[index]=each;
            index++;
        }

        return  yeniarr;
    }
    }



