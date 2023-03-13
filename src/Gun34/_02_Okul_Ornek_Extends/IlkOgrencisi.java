package Gun34._02_Okul_Ornek_Extends;

public class IlkOgrencisi extends Ogrenci{
   private String klup;
    public IlkOgrencisi(String isim, ogrTip tipi,String klup) {
        super(isim, tipi);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    @Override
    public String toString() {
        return "IlkOgrencisi{" +
                "klup='" + klup + '\'' +
                "} " + super.toString();
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }
}
