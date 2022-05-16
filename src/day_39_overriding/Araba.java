package day_39_overriding;

public class Araba {

  protected   String hareket = "Arabalar Teker ile hareket eder";
    protected    String hız = "Arabalar motor gucune gore hız yapar";
    protected    String yakit = "Arabalar farklı yakıtlar kullabılır";
    protected    String marka = "Arabalar uretildikleri markaya sahiptir";

    public void motor() {
        System.out.println("Arabalar farklı markalarda motor ");
    }

    public void yakıtTuketimi() {
        System.out.println("arabalar motor gucu ve yakıt turune gore yakıt tuketırler");
    }
}
