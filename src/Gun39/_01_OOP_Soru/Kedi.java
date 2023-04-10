package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{

    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("hepcil");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("18 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
