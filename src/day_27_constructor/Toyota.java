package day_27_constructor;

public class Toyota {
    //defaulut consctır var(paremetrsi yok) o yuzden runnerdakı paremetresiz obje burdaki constructorla eslesir ve bilgileri alır
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public  void  maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("benzinli arac max 240 km hiz yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel arac maz 260 km hız yapar");
        }
    }
    public  void  renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("corolla kırmızı renktir");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris mavi renktır");
        }
    }
}
