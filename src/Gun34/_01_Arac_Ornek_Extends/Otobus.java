package Gun34._01_Arac_Ornek_Extends;

public class Otobus extends Arac{
    private int Yolcukapasitesi;
    public Otobus() {
    }

    public Otobus(String renk, double motorHacmi, String marka,int Yolcukapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcukapasitesi(Yolcukapasitesi);
    }

    public int getYolcukapasitesi() {
        return Yolcukapasitesi;
    }

    @Override
    public String toString() {
        return getRenk()+" "
                +getMarka()+" "
                +getMotorHacmi() + " "
                + getYolcukapasitesi();
    }

    public void setYolcukapasitesi(int yolcukapasitesi) {
        Yolcukapasitesi = yolcukapasitesi;
    }
}
