package Gun38._04_Abstract_Soru;

public abstract class Food {
    private String name;

    abstract public void madeIn();
    abstract public void taste();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
