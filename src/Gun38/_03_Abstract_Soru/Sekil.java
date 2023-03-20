package Gun38._03_Abstract_Soru;

public abstract class Sekil {
    private String name;

    abstract double alan(); // soyut - abstract

    abstract double cevre(); // soyut


    @Override
    public String toString() {
        return "Sekil{" +
                "\nname='" + name + '\'' +
                "\nalan='" + alan() + '\'' +
                "\nalan='" + cevre() + '\'' +
                "}\n";
    }

    public void ciz() { // somut
        System.out.println(name + "  isimli şekil çizildi");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}