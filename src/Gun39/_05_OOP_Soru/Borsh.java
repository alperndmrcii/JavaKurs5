package Gun39._05_OOP_Soru;

public class Borsh implements Food{

    void boil(){
        System.out.println("haşlandı");
    }
    void eatTomorrow(){
        System.out.println("ertesi güne kadar bekletildi");
    }
    @Override
    public void taste() {
        System.out.println("Sıcacık lezzetli çorba");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
