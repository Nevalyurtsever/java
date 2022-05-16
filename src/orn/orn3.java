package orn;

public class orn3 {
    // main method olusturma sadece methodlrı barındıran bir depo yap
    public static void beskelimeterstenyazdir(String kelime) {
        String tersKelime = kelime.substring(4) + kelime.substring(3, 4) + kelime.substring(2, 3) + kelime.substring(1, 2) + kelime.substring(0, 1);
        System.out.println("kelime sayınız: " + kelime.length());
        System.out.println("kelimenin tersten yazılısı: " + tersKelime);
    }

    public static void dortkelimeterstenyazdir(String kelime) {
        String tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("kelime sayınız: " + kelime.length());
        System.out.println("kelimenin tersten yazılısı: " + tersKelime);
    }
}
