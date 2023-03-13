package Gun34._03_Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="karakedi"; // public erişildi
        p1h.yas=25; // default erişildi
        p1h.cinsi="tekir";
        // p1.renk private sadece kendi classından erişilir
    }
}
