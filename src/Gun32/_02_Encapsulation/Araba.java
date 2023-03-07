package Gun32._02_Encapsulation;

public class Araba {
   private String renk;
   private int model;
   private double motorHacmi;
   private int kapiSayisi;

     String getRenk() {
        return renk;
    }

     void setRenk(String renk) {
        this.renk = renk;
    }

     int getModel() {
        return model;
    }

     public void setModel(int model) {
         if (model<2023)
        this.model = model;
         else
             System.out.println("hatalı model");
    }

     double getMotorHacmi() {
        return motorHacmi;
    }

     void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    int getKapiSayisi() {

        return kapiSayisi;
    }

     void setKapiSayisi(int kapiSayisi) {
         if (kapiSayisi<8)
        this.kapiSayisi = kapiSayisi;
         else
             System.out.println("hatalı kapı sayısı");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }

    public Araba() {
         setRenk(renk);
         setMotorHacmi(motorHacmi);
         setModel(model);
         setKapiSayisi(kapiSayisi);


    }

}
