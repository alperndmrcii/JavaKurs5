package Gun31._03_Enum;

public enum Aylar {
    OCAK(1, 31,"Ocak"),
    SUBAT(2,28,"Şubat"),
    MART(3,30,"Mart"),
    NISAN(4,31,"Nisan"),
    MAYIS(5,30,"Mayıs"),
    HAZIRAN(6,31,"Haziran"),
    TEMMUZ(7,30,"Temmuz"),
    AGUSTOS(8,31,"Agustos"),
    EYLUL(9,30,"Eylül"),
    EKIM(10,31,"Ekim"),
    KASIM(11,31,"Kasım"),
    ARALIK(12,30,"Aralık");

    int ayNo;
    int gunMiktar;
    String ayAd;

    Aylar(int ayNo, int gunMiktar, String ayAd) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.ayAd = ayAd;
    }
}
