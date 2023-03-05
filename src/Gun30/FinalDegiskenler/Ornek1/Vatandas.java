package Gun30.FinalDegiskenler.Ornek1;

public class Vatandas {
    String isim;
   final int tcNo;

    static int tcNoSayac=1;

    public Vatandas(String isim)
    {
        this.isim = isim;
        this.tcNo=tcNoSayac++;
        // final değişlenlerine sadece 1 kez veri ataanabilir
        // o da tnaımlarken ya da constuctorda.
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
