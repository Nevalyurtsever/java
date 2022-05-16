package day_37_inheritance;

import day_36_inheritance.Parent;

public class Child  extends Parent {
    //bir class ı child class yaptıgımızda parent classtakı constructor'a
    //ulasması gerekir bu durumda parent classtakı constructor ın acces modifier
    //ı uygun bir modifier yapılmalıdır(publıc-protected)

    Child(){
        super();
        System.out.println("child class paremetresiz cons");
    }
    Child(int s){

        //Child classta tum constructorların ilk satırına javanın yerlestirdigi
        //constructor paremetresiz'dir super()

        System.out.println("Child class paremetreli cons");
    }

    Child (int sayi1,int sayi2){
        //Eger parent class dan paremetresiz const o'ı degil de
        //baska bir const.'ı calıstırmak ısterseniz
        //bunu child class dakı const'ın ILK SATIRINA yazmak gerekir
        super(sayi1,sayi2);
        System.out.println("iki paremetreli cons.");
    }

    public static void main(String[] args) {
        Child child=new Child(5,7);


    }
}
