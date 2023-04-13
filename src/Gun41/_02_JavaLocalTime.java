package Gun41;

import Gun39._05_OOP_Soru_HocaninYaptigi.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) {

        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true) {

            LocalTime saat = LocalTime.now();
            System.out.print("\r"+saat.format(of1));
            MyFunc.Bekle(1);
        }
    }
}
