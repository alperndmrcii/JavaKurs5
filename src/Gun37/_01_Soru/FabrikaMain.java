package Gun37._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar("model 5", 310.0);
        ToyotaPriusHybrid toyota = new ToyotaPriusHybrid("sedan", 1200.0);
        Bus iveco = new Bus("iveco", 7000.0);

        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(toyota);
        arabalar.add(iveco);

        for (Vehicle v : arabalar) {
            System.out.println("-------------------------------------------------");
            System.out.println(v.getClass().getSimpleName()); // class'ın adını verir.
            System.out.println("------------------------------------------------");
            System.out.println("v. = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());
            if (v instanceof TeslaCar) {
                System.out.println( ((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changeBattery());
            }
            else
                if (v instanceof ToyotaPriusHybrid){
                    System.out.println( ((ToyotaPriusHybrid)v).drive());
                    System.out.println(((ToyotaPriusHybrid)v).changeBattery());
                    System.out.println(((ToyotaPriusHybrid)v).changeOil());
                }
                else
                    if (v instanceof Bus)
                    {
                        System.out.println(((Bus)v).drive());
                        System.out.println(((Bus)v).changeDiesel());
                    }

        }
    }
}
