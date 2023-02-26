package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {
        HashSet<String> renkler=new HashSet<>();
        renkler.add("red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");
        // ekrana yazdırma
        System.out.println("renkler = "+renkler);

        // Ekrena tek tek nasıl yazdırırım.
        for(String eleman:renkler){ // Sıra Garanti Değil.
            System.out.println("eleman = "+eleman);
        }
        // foreach ile örnek olsun diye eklendi
        // int[]dizi={34,5,6,7,8,89,899,777};
        //for (int sayi : dizi)
        //{
        //    System.out.println("sayi = "+sayi);
        //}

        // set in kendi sırası nasıl ise onun aynısını verir.
        Iterator gosterge= renkler.iterator();
        while (gosterge.hasNext()){
            System.out.println("gosterdiği eleman = "+gosterge.next());
            // .Next göstergenin gösterdiği elemanı temsil ediyor.
        }
    }
}
