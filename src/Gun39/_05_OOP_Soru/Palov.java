package Gun39._05_OOP_Soru;

public class Palov implements Food{

    void fry(){
        System.out.println("kızartıldı");

    }

    void boil(){
        System.out.println("haşlandı");
    }
    @Override
    public void taste() {
        System.out.println("Leziz bir palov");
    }

    @Override
    public double ucret() {
        return 44;
    }
}
