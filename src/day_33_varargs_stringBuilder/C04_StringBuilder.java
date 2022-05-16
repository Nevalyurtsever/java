package day_33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Yasasın Java");

        System.out.println(sb1.indexOf("Java")); //8

        System.out.println(sb1.lastIndexOf("s"));

        System.out.println(sb1.replace(0,7,"Ne guzel"));//Ne guzel Java

        System.out.println(sb1);//Ne guzel Java

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        System.out.println(sb1);//Ne guzel Java

        System.out.println(sb1.delete(0,3));//guzel Java

        System.out.println(sb1.deleteCharAt(5));//guzelJava


    }
}
