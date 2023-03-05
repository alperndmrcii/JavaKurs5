package Gun30;

public class Okul {
    public static void main(String[] args) {


        //        Ogrenci ogr1=new Ogrenci("ismet","Temur","Yıldırım Ilkokulu");
//        Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım Ilkokulu");
//        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım Ilkokulu");
//
//
//        // ...
//        //...
//        Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım Ilkokulu");
//        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım Ilkokulu");
// Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi
        Ogrenci ogr1=new Ogrenci("İsmet","Temur");
        System.out.println("ogr1 = "+ogr1);

        Ogrenci.okulAd="Atatürk İlkokulu";

        System.out.println("ogr1 tekrar = "+ogr1);

        // aynı verinin çok kez girişi engellendi
        // aynı verinin hafızada nesne asayısı kadar tekrarlanması engellendi

    }
}