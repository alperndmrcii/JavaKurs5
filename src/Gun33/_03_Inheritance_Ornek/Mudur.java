package Gun33._03_Inheritance_Ornek;

public class Mudur extends Calisan{
    private double tazminat;

    public Mudur(String isim, double maas, double maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    public double getTazminat() {
        return tazminat;
    }

    @Override
    public String toString() {
        return "Mudur{" +
                "isim= " + getIsim() +
                "maas= " + getMaas() +
                "maaskatsiyisi= " + getMaasKatSayisi()+
                "tazminat=" + tazminat +
                "ödenecek maaş = " + maasHesapla() +
                '}';
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;
    }
}
