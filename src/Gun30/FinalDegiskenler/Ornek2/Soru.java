package Gun30.FinalDegiskenler.Ornek2;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun=0;
        int saat=0;
        int dakika=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("gun = "); gun= oku.nextInt();
        System.out.print("saat = "); saat= oku.nextInt();
        System.out.print("dakika = "); dakika= oku.nextInt();

        int toplamSaniye=
                gun
                * Sabitler.birGundekiSaatSayisi
                * Sabitler.birSaattekiDakikasayisi
                * Sabitler.birDakikadakiSaniyeSayisi
                +saat
                * Sabitler.birSaattekiDakikasayisi
                * Sabitler.birDakikadakiSaniyeSayisi
                +dakika
                * Sabitler.birDakikadakiSaniyeSayisi;
        System.out.println("toplamSaniye = " + toplamSaniye);






    }
}
