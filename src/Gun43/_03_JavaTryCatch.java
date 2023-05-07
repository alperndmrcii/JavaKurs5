package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program çalışmaya başladı");

        try { // dene, hatanın başladığı yerin üstüner konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        }catch (Exception ex)
                // ex isimli değişkene oluşan hataların bilgisi atanıyor
                // hata olduğunda yapılması istenilenburaya yazılıyor
        {
            System.out.println("hata oluştu lütfen tekrar deneyiniz ");
            System.out.println("Tüm Hata Mesajı = " +ex);
            System.out.println("Hatanın açıklaması = "+ex.getMessage());
            //kendine hata mesajını mail atabilirsin.
            // log tutma : program nasıl çalışıyor, hata loglarını harddiske yazabilirsin.

        }

        System.out.println("program bitti");
        try {

            // java ve toolları çalışmaya devam et
            // konuları öğrenmeye ve çalışmaya devam
            // anlmadığın yer mi oldıu ? kırılmadan devam et:
        }catch (Exception ex)
        {
            // hatalanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları izle
            // grup çalışması yap
            // öğren ve kırılmadan devam et
            // unutma sen bir söz verdin, DEVAM
        }
    }
}
