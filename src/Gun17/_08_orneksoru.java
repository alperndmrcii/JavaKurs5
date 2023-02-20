package Gun17;

import java.util.Scanner;

public class _08_orneksoru {
    public static void main(String[] args) {

        // Girilen bir sayının pozitif olup olmadpıunı pozitifse çift olup olmadgunu yazdırnız
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi = oku.nextInt();

        System.out.println(sayi >= 0 ? "Pozitif" + (sayi % 2 == 0 ? "Çift" : "Tek") : "Negatif" + (sayi % 2 == 0 ? "çift" : "Tek"));

        //   2.Yöntem

        if (sayi >= 0) {
            System.out.println("pozitif");
            if (sayi % 2 == 0) {
                System.out.println("çift");
            } else
                System.out.println("tek");
        } else {
            System.out.println("Negatif");
            if (sayi % 2 == 0) {
                System.out.println("çift");
            } else
                System.out.println("tek");
        }
    }
}