package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1 = new Kopek("karabaş");
        // kopek1.ses(); // havladı
        // kopek1.Kokladi(); // kokladı;
        Kedi kedi1 = new Kedi("pamuk");
        // kedi1.ses(); // miyavladı
        // kedi1.Tirmaladi(); // Tırmaladı
        //  kopekSesi(kopek1); // havladı
        //  kediSesi(kedi1); // Miyavladı
        hayvanSesi(kopek1); // havladı
        hayvanSesi(kedi1); // Miyavladı
        Hayvan hayvan1=new Hayvan("ördek");
        Hayvan hayvan2=new Kopek("kangal");
        Hayvan hayvan3=new Kedi("boncuk");

        hayvan1.ses();
        hayvan2.ses();
        hayvan3.ses();
        System.out.println("-------------------");
        hayvan2.ses();
        ((Kopek)hayvan2).Kokladi();

    }

    public static void kopekSesi(Kopek kopek) {
        kopek.ses();
    }

    public static void kediSesi(Kedi kedi) {
        kedi.ses();
    }

    // bir classın aslında kim olduğunu bulma yöntemi
    public static void hayvanSesi(Hayvan hayvan) {
        hayvan.ses();
    if (hayvan instanceof Kopek)
        ((Kopek)hayvan).Kokladi();
    if (hayvan instanceof Kedi )
       ((Kedi) hayvan).Tirmaladi();

    }






}
