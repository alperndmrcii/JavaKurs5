package Gun33._02_Inheritance_Ornek;

public class Kedi extends Hayvan {

    @Override
    public void konustu() {
        System.out.println("Kedi Miyavladı");
    }

    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }
}
