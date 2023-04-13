package Gun41;

import Gun39._05_OOP_Soru_HocaninYaptigi.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_Odev {
    public static void main(String[] args) {

        //  TODO // alınan saati geriye doğru saniye saniye yazdırınız.

        LocalTime geriye=LocalTime.now();
       DateTimeFormatter of1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true) {
            geriye=geriye.minusSeconds(1);
            MyFunc.Bekle(1);
            System.out.print("\r" + geriye.format(of1));
        }
    }
}
