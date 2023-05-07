package Gun43;


import java.util.Scanner;

public class _02_JavaRuntimeException {

    public static void main(String[] args) {

        System.out.println("Program başladı");
        for (int i = 0; i < 3; i++) {

            try { // hata bölgesini try{} şne aldık
                Scanner oku = new Scanner(System.in);
                System.out.print("sayi 1 = ");
                int sayi1 = oku.nextInt();

                System.out.print("sayi 2 = ");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bölüm = " + bolum);
            } catch (Exception hata)
            // hata mesajlarını hata isimli Exception cinsinden değişkene attım
            {
                System.out.println("hata = " + hata.getMessage());
                System.out.println("Lüften tekrar deneyiniz ");
                i--;
            }
            System.out.println("Program bitti");
        }
    }
}
