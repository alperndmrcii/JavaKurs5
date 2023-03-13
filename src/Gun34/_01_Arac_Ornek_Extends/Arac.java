package Gun34._01_Arac_Ornek_Extends;

public class Arac {
    // 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
    // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
    //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.

    private String renk;
    private double motorHacmi;
    private String marka;

    public Arac() {
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(double motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", marka='" + marka + '\'' +
                '}';
    }

    public Arac(String renk, double motorHacmi, String marka) {
        setRenk(renk);
        setMarka(marka);
        setMotorHacmi(motorHacmi);
    }
}
