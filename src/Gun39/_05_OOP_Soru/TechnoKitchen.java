package Gun39._05_OOP_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoKitchen {

    public void islemYap() {
        Scanner oku = new Scanner(System.in);
        ArrayList siparisler = new ArrayList<>();
        int siparis = 0;
        int secim;
        int toplamhesap=0;
        do {

            System.out.println("----------------------");
            System.out.println("---------MENÜ---------");
            System.out.println("----------------------");
            System.out.println("1- Adana Kebap 55TL");
            System.out.println("2- lahmacun 33TL");
            System.out.println("3- Borsh 33TL");
            System.out.println("4- Palov 44TL");
            System.out.println("0- Sipariş Tamamlandı");
            System.out.print("Seçiniz = ");
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    AdanaKebap a = new AdanaKebap();
                    siparisler.add(a);
                    siparis++;
                    toplamhesap=toplamhesap+55;
                    break;
                case 2:
                    Lahmacun l = new Lahmacun();
                    siparisler.add(l);
                    siparis++;
                    toplamhesap=toplamhesap+33;
                    break;
                case 3:
                    Borsh b = new Borsh();
                    siparisler.add(b);
                    siparis++;
                    toplamhesap=toplamhesap+33;
                    break;
                case 4:
                    Palov p = new Palov();
                    siparisler.add(p);
                    siparis++;
                    toplamhesap=toplamhesap+44;
                    break;

            }
            if (secim > 4) {
                System.out.println("hatalı giriş");
            }

            System.out.println("Sepetinizde " + siparis+" adet ürün var");
            System.out.println("Toplam Ödenecek Tutar = "+toplamhesap+"TL");

        } while (secim != 0);
    }
}





