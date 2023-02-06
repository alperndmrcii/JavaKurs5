package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz ve bir satırda boyunuz ve kilonuz şeklinde yazdırınız
        // vucut kitle endeksini de bularak yazdırınız (kg/boy*boy)

        double Kilo=85;
        int boy=185;
        double vucutkitleendeksi= Kilo/(boy*boy);
        System.out.println("Kilonuz = " + +Kilo+" Boyunuz="+boy);
        System.out.println("Vucut Kitle Endeksiniz = " + vucutkitleendeksi);


    }
}
