package Gun33._02_Inheritance_Ornek;

public class HayvanatBahcesi {
    //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("beyaz",50,"kangal");
        kopek1.konustu();
        Kedi kedi1=new Kedi("sari",5,"tekir");
        kedi1.konustu();
        Ordek ordek1=new Ordek("beyaz",2,"pekin",3);
        ordek1.konustu();
        Yilan yilan1=new Yilan("siyah",350,"piton",15);
        yilan1.konustu();




    }
}
