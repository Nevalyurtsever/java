package day_26_forEachLoop_constructor;

public class odev1 {
    public static void main(String[] args) {
        //bir integer array olusturun ve bu arraydakı tum sayıların carpımınıfor each loop kullanrak bulunuz
        Integer arr[]={1,2,3,4,5};
        int carpım=1;
        for (int each:arr)
              {
            carpım*=each;
        }
        System.out.print("sayıların carpımı "+carpım);
    }
}
