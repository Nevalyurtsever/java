package bir;

import java.util.ListIterator;

public class iki {
  private int a;
  private int b;
  private String isim;

    @Override
    public String toString() {
        return "iki{" +
                "a=" + a +
                ", b=" + b +
                ", isim='" + isim + '\'' +
                '}';
    }

    public iki(int a, int b, String isim) {
        this.a = a;
        this.b = b;
        this.isim = isim;
    }

}
