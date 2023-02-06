package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi=5;  // hafızada int kadar yer ayırıyor, sadece tam sayı atılabiliyor.

        // tam sayılar
        byte byteDeger=7; // -128 127
        short shortDeger=1645; // -32000...32000
        int intDeger=250000;
        long longDeger=232323232323233L;

        // ondalıklı sayılar
        double doubleDeger=3.1445456564545; // noktadan sonra 16 hane duyarlıdır.
        float floatDeger=3.1443434F; // noktadan sonra 7 hane duyarlıdır

        // karakter ve karakterler
        char basHarf='A'; // bir tane harf saklayabilir
        String isim="ismet"; // kelime veya cümle saklayabilir.


        System.out.println("isim = " + isim);
        System.out.println("basHarf = " + basHarf);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("lonDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("isim = " + isim);
        System.out.println("sayi = " + sayi);
    }
}
