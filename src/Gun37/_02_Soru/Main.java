package Gun37._02_Soru;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     //  Ekteki Tasarıma göre gerekli modülleri yazınız.
     //  Sonra her birinden nesne üretiniz.
     //  ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
     //  bir döngü ile metodlarını ekrana yazdırınız.
     //  metodların hepsinin tipi String


        Duck ordek=new Duck();
        ordek.food();
        ordek.nasilUcuyor();
        ordek.nasilYuzuyor();
        Swallow kirlangic=new Swallow();
        kirlangic.food();
        kirlangic.nasilUcuyor();
        Cat kedi=new Cat();
        kedi.food();
        Shark kbaligi=new Shark();
        kbaligi.food();
        kbaligi.nasilYuzuyor();

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(ordek);
        hayvanlar.add(kedi);
        hayvanlar.add(kbaligi);
        hayvanlar.add(kirlangic);

        for (Animal a:hayvanlar) {
            System.out.println("-------------------------------------------------");
            System.out.println(a.getClass().getSimpleName()); // class'ın adını verir.
            System.out.println("------------------------------------------------");
            System.out.println("a.food() = " + a.food());
            if (a instanceof Duck)
            {
                System.out.println(((Duck)a).food());
                System.out.println(((Duck)a).nasilUcuyor());
                System.out.println(((Duck)a).nasilYuzuyor());
            }
            else
                if (a instanceof Cat)
                {
                    System.out.println(((Cat)a).food());
                }
                else
                    if (a instanceof  Shark)
                    {
                        System.out.println(((Shark)a).food());
                        System.out.println(((Shark)a).nasilYuzuyor());
                    }
                    else
                        if (a instanceof Swallow)
                        {
                            System.out.println(((Swallow)a).food());
                            System.out.println(((Swallow)a).nasilUcuyor());
                        }
        }
    }
}
