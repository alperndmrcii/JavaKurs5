package Gun39._05_OOP_Soru;

public class AdanaKebap implements Food{

    void marinade(){
        System.out.println("marine edildi");
    }
    void grill(){
        System.out.println("ızgaraya atıldı");
    }


    @Override
    public void taste() {
        System.out.println("Leziz");
    }

    @Override
    public double ucret() {
        return 55;
    }
}
