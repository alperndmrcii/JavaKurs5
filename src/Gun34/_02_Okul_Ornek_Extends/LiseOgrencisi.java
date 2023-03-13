package Gun34._02_Okul_Ornek_Extends;

public class LiseOgrencisi extends Ogrenci{
    private String brans;

    public LiseOgrencisi(String isim, ogrTip tipi,String brans) {
        super(isim, tipi);
        setBrans(brans);
    }

    @Override
    public String toString() {
        return "LiseOgrencisi{" +
                "brans='" + brans + '\'' +
                "} " + super.toString();
    }

    public String getBrans() {
        return brans;
    }
    public void setBrans(String brans) {
        this.brans = brans;
    }
}
