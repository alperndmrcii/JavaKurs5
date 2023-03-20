package Gun38._01_Abstract;
// 2 si 1 arada => 1 interface+1 parent class= abstact class oluyor.
public abstract class BinekOto {
    // abstact class 1 koşullu interface yerine abstact yazdığımızda kullanılıyor hem interface hem de parent class bir arada oluyor.

    private String marka;

    private int uretimYili;

    private int vitesAdedi;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public BinekOto(String marka, int uretimYili, int vitesAdedi) {
        setMarka(marka);
        setVitesAdedi(vitesAdedi);
        setUretimYili(uretimYili);
    }
    abstract int HizlanmaSuresi();

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
