package Gun26.Gun26_01_Ornek;

public class Kampus {
    public static void main(String[] args) {


        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip
        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="İsmet Temur";



        //1.Yöntem
        ogr.okulu=new Okul();
        ogr.okulu.adi="Mehmet Akif Ersoy";
        ogr.okulu.mudurAdi="Merve Arslan";
        ogr.okulu.ucreti=500000;

        //2.yöntem
        Okul ok=new Okul();
        ok.adi="Mehmet Akif Ersoy";
        ok.mudurAdi="Merve Arslan";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("ogr.okulu = " + ogr.okulu);
        System.out.println("ogr.okulu.ucreti = " + ogr.okulu.ucreti);
        System.out.println("ogr.okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ogr.okulu.adi = " + ogr.okulu.adi);
    }
}
