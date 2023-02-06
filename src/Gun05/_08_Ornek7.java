package Gun05;

import java.util.Scanner;

public class _08_Ornek7 {
    public static void main(String[] args) {

        ///kullanıcıdan ağırlığını double boyunu double olarak alınız ve bir satırda boyunu ve kilonuz şeklinde yazdırnız.
        // vucut kitle endeksini de bularak yazdırnız. (kg/ boy*boy)

        Scanner oku= new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz");
        double boy= oku.nextDouble();
        System.out.print("Kilonuzu Giriniz");
        double kilo= oku.nextDouble();
        System.out.print("kilo = " + kilo);
        System.out.print("boy = " + boy);
        double vucutkitleindeksi= kilo/ (boy*boy);
        System.out.print("vucutkitleindeksi = " + vucutkitleindeksi);

    }
}
