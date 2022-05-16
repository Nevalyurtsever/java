package day_19doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir tamsayi alıp
        //while loop ile  5 den kucuk pozitif tam sayıları yazdıralım

        int input = 3;


        int sayi = 1;
        while (sayi < input) { // 2 kere yazdırdık ama 3 kere kontrol ettık while loop once kontrol yapıyor
            System.out.print(sayi + " ");
            sayi++;

        }
        System.out.println(" ");
        // aynı soruyu do-while loop ıle yapalım
        sayi = 1;
        do {
            System.out.print(sayi + " ");
            sayi++;
        } while (sayi < input);


//once kullanıcıdan almak sonra kontrol yapmak ıstıyorsak do while loop


    }
}
