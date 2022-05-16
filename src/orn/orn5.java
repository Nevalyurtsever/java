package orn;


public class orn5 {
    public static void main(String[] args) {
        // iki variable'in degerlerini toplayan bir method olusturalim
        // 1.adim : method adini yazalim
        // 2.adim : method'a gondermem gereken argument var mi ?

        int num1=5;
        int num2=9;
        numtopla(num1,num2);
    }

    public static void numtopla(int num1, int num2) {
        System.out.println("iki sayı toplamı :"+(num1+num2));
    }
}
