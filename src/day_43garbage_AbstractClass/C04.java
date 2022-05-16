package day_43garbage_AbstractClass;

public abstract class C04 {
    /*
    bir abstract classta abstract veya concrete methodlar bulunabılır
    Child classların abstract methodları override etmesı mecburu ıken concrete methodların override edilmesi "OPSİYONELDİR."

     */
    public abstract void absMethod();

    public void concreteMethod() {
        System.out.println("C04 concrete method");
    }
    public static void concreteStaticMethod(){
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
       /*
       Abstract class lar cons a sahiptir ancak abstract classlardan obje olusturulamaz
       Abstarct classlar Obje barındırmayan sadece child classlar ıcın uyulması sart olan veya posiyonel bırakılan
       ozelliklerı tanımladıgımız bir depo class gibidir
        */
        // C04 obj=new C04();
        System.out.println("Bu class abstract");
        concreteStaticMethod();
    }
}
