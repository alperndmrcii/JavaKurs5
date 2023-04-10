package Gun39._01_OOP_Soru;

public abstract class Hayvan {

    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecegi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=idSayac++;
    }

    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    private static int idSayac=1;

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }


    @Override
    public String toString() {
        System.out.print("yiyeceği = ");yiyecegi();
        System.out.print("yemek miktari = ");yemekMiktari();
        System.out.print("uyku süresi = ");gunlukUykuSuresi();
        System.out.print("sesi = ");sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}


