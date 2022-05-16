package day_19doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın ve bu sayıın rakamlar toplamını yazdırın

        int input = 7629;
        int rakam = 0;
        int rakamlarToplamı = 0;
        while (input > 0) {

            rakam = input % 10;
            rakamlarToplamı += rakam;
            input /= 10;


        }
        System.out.println("rakamlar toplamı: "+ rakamlarToplamı);

    }
}
