package Gun33._02_Inheritance_Ornek;

public class Yilan extends Hayvan{

    private int uzunluk;
    public Yilan(String renk, int kilo, String cinsi,int uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    @Override
    public void konustu() {
        System.out.println("yılan tısss");
    }

    public int getUzunluk() {
        return uzunluk;
    }

    @Override
    public String toString() {
        return "Yilan{" +
                "uzunluk=" + uzunluk +
                '}';
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
