package Gun35._02_Polymorphism;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
}
    public void Kokladi()
    {
        System.out.println("kokladı");
    }
}
