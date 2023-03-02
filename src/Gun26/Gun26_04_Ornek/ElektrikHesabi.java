package Gun26.Gun26_04_Ornek;

public class ElektrikHesabi {
    int toplamtuketim=0;
    double birimFiyat=0.7;
    double fatura=0;
    public void tuketimekle(int aylikTuketim)
    {
        toplamtuketim+=aylikTuketim;
    }
    public void toplamtuketimyaz()
    {
        System.out.println("toplamtuketim = " + toplamtuketim);
    }
    public void faturaYaz(String isim)
    {
        double toplamTutar=toplamtuketim*birimFiyat;
        System.out.println("*****************");
        System.out.println("Faturanız");
        System.out.println("*****************");
        System.out.println("Müşteri = "+ isim);
        System.out.println("toplam tüketim = "+toplamtuketim);
        System.out.println("Toplam tutar = "+Math.round(toplamTutar));
        System.out.println("************************");

    }

}
