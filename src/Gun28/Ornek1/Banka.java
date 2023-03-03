package Gun28.Ornek1;

public class Banka {
    String name;
    int subeSayisi;
    int kurulusyili;

    public Banka(String name, int subeSayisi, int kurulusyili) {
        this.name = name;
        this.subeSayisi = subeSayisi;
        this.kurulusyili = kurulusyili;
    }

    public Banka() {
    }

    public Banka(String name, int subeSayisi) {
        this.name = name;
        this.subeSayisi = subeSayisi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "name='" + name + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusyili=" + kurulusyili +
                '}';
    }
}
