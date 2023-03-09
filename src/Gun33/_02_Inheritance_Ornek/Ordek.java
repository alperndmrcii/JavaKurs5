package Gun33._02_Inheritance_Ornek;

public class Ordek extends Hayvan{
    private int kanatAcikligi;

    @Override
    public void konustu() {
        System.out.println("Ördek vak vak ");
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public String toString() {
        return "Ordek{" +
                "kanatAcikligi=" + kanatAcikligi +
                '}';
    }

    public Ordek(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);


    }
}
