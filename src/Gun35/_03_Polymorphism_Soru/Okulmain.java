package Gun35._03_Polymorphism_Soru;

public class Okulmain {
    public static void main(String[] args) {

        // 1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
        // 2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
        // 3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
        // olacak kimlik belgesi formu oluşturan tek bir metod yazınız.

        Ogrenci ogr=new Ogrenci("alperen","demirci","ogrenci","5A");
        Calisan cal=new Calisan("sibel","akay","yazilim","bilgi islem");

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);


    }
}
