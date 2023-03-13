package Gun34._02_Okul_Ornek_Extends;

public class Ogrenci {
    // 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
    // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
    // 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
    // 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
    // 5- Oluşturuken her öğrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.

    private final int id;
    private String isim;
    private ogrTip tipi;

    public Ogrenci(String isim, ogrTip tipi) {
        setIsim(isim);
        setTipi(tipi);
        this.id=idSayac++;
    }

    private static int idSayac=1;

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public ogrTip getTipi() {
        return tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }

    public void setTipi(ogrTip tipi) {
        this.tipi = tipi;
    }

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Ogrenci.idSayac = idSayac;
    }
}
