package Gun34._03_Protected.Paket2;

import Gun34._03_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan p1h=new P1Hayvan();
        p1h.ad="köpke"; // public erişildi
        // p1h.yas default diğer paketten erişilmez;
        // p1h.cinsi protected diğer paketten direkt erişemedim
    }
}
