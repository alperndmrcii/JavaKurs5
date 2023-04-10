package Gun39._05_OOP_Soru_HocaninYaptigi;

public class Borsh implements IFood{
    @Override
    public void taste() {
        System.out.println("Enfes Borsh Afiyet Olsun!");
    }

    @Override
    public double ucret() {
        return 33;
    }

    void boil(){
        System.out.println("Haşlandı...");
    }

    void eatTomorrow(){
        System.out.println("1 gün bekletip öyle yemeye dikkat et.");
    }
}
