package Gun27._02_Ornek2;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.



      int max =MyMath.getMax(4,6);
      int min=MyMath.getMin(4,6);
      int rndm=MyMath.getRandom(10);
      double usSonuc=MyMath.getUsAl(2,3);
      double karekok=MyMath.getKareKok(16);

        System.out.println("karekok = " + karekok);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("rndm = " + rndm);
        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }
}
