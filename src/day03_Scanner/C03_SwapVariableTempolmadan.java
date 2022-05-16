package day03_Scanner;

public class C03_SwapVariableTempolmadan {
    public static void main(String[] args) {
         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
        Orn  : sayi1=10 ve sayi2=20; kod calistiktan sonra  sayi1=20 ve sayi2=10 */

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swaptan once sayi1: "+sayi1+" sayi2: "+sayi2);

        int yeniSayi1=sayi1+(sayi2-sayi1);
        int yeniSayi2=sayi2-(sayi2-sayi1);
        System.out.println("Swaptan sonra sayi1: "+yeniSayi1+" sayi2: "+yeniSayi2);

    }
}
