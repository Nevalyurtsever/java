package day_17forLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        //10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

        for (int i = 10; i <30 ; i++) {

            System.out.print(i+",");
        }
        System.out.println("30"); //30 yazdırıp asagı gecti

        int baslangıc=15;
        int bitis=30;

        for (int i = baslangıc; i <=bitis ; i++) {
            if (i<bitis){
                System.out.print(i+",");
            }else{
                System.out.println(i);//ilk print sonra println
            }

        }


    }
}
