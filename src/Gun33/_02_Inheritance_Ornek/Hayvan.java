package Gun33._02_Inheritance_Ornek;

public class Hayvan { // super class, base class, parent class
    private String renk;
    private int kilo;
    private String cinsi;


    public Hayvan(String renk, int kilo, String cinsi) {
        setKilo(kilo);
        setRenk(renk);
        setCinsi(cinsi);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        setRenk(renk);
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public void konustu ()
    {
        System.out.println("ses çıkardı");

    }
}
