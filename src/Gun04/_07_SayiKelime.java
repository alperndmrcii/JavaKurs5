package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // şu ana kadar, sayiları birbirine çevirdik
        // yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi var

        String ad="İsmet";
        String kelimeSayi="65"; // string halde, toplama gibi bir işleme giremez

        int sayiDeger= Integer.parseInt(kelimeSayi); // sayiya dönüşür
        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam su anda int yani sayi, bunu string'e nasıl dönüştürürüm ?
        String strToplam= Integer.toString(toplam); // Stringe dönüştürür
        System.out.println("strToplam = " + strToplam);

    }
}
