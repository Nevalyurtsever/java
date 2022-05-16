package day_17forLoop;

public class C08_Palindrom {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir method yazınız
        String input="madam";

 palindromeKontrolEt(input);

    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0; i--) {
            terstenInput+=input.substring(i,i+1);
        }
        System.out.println("giediginiz kelimenin tersten yazılısı: "+terstenInput);
        if (input.equals(terstenInput)){
            System.out.println("girdiginiz kelime palındrome");
        }else {
            System.out.println("girdiginiz kelime palındrome degil");
        }
    }
}
