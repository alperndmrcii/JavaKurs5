package Gun36._03_Interface;

public class GeometriMain {
    public static void main(String[] args) {


        Dikdortgen d=new Dikdortgen();
        d.ciz();
        Cember c=new Cember();
        c.ciz();
        //interfacelerden nesne üretilme fakat referans tipi oluşturulabilir.
        // Bu bize polymorphism sağladı.

        ICizdirir c2=new Cember();
        c2.ciz(); // cember cizildi
        // direkt olarak sadece interfacedeki isim verilmiş olanlar metoda erişebilsin.

        cizdirme(c);
        cizdirme(d);


    }
    public static void  cizdirme(ICizdirir iciz)
    {
        iciz.ciz();
    }
}
