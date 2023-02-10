package Gun07;

public class _05_StringSubString {
    public static void main(String[] args) {
        // Stringin belli bir bölümünü alma işlemini yapar.

        String s1="Merhaba Arkadaşlar";
        String parca1=s1.substring(3,9); // 3 nolu inexten 9nolu indexe kadar 9 dahil değil
        System.out.println("parca1 = " + parca1);
        String parca2=s1.substring(8,15); // 8den 15e kadar alıyor 15dahil değil
        System.out.println("parca2 = " + parca2);
        String parca3=s1.substring(8); // verilenden başlayıp sonuna kadar alıyor.
        System.out.println("parca3 = " + parca3);

    }
}
