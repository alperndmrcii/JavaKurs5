package Gun38._04_Abstract_Soru;

public class YemekDunyasi {
    public static void main(String[] args) {
        GreekSalad gr=new GreekSalad();
        gr.setName("Greek Salad");
        gr.madeIn();
        gr.taste();
        CheeseCake chs=new CheeseCake();
        chs.setName("CheeseCake");
        chs.madeIn();
        chs.taste();
        Baklava bkv=new Baklava();
        bkv.setName("Baklava");
        bkv.madeIn();
        bkv.taste();
    }
}
