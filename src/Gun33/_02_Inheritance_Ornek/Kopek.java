package Gun33._02_Inheritance_Ornek;

public class Kopek extends Hayvan{
    @Override
    public void konustu() {
        System.out.println("Köpek havladı");
    }

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);




    }
}
