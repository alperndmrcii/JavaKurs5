package Gun39._05_OOP_Soru;

public class Lahmacun implements Food{

    void dough() {
        System.out.println("Lahmacun hamuru");

    }
    void addMeat(){
        System.out.println("et eklendi");
    }
    void bake(){
        System.out.println("lahmacun pişirildi");
    }

    @Override
    public void taste() {
        System.out.println("Kaşarlı yumuşacık lahmacun");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
