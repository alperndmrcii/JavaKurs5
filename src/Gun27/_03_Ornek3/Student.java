package Gun27._03_Ornek3;

import java.util.ArrayList;

public class Student {

    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders)
    {
        int suanToplamSaat=0;
        for (Lesson d:dersleri)
            suanToplamSaat+=d.saat;

        if (suanToplamSaat+ders.saat<=maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name+" Kredi Sınırı Aşıldı");

    }
}
