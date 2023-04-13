package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {


        // Duration : hem LocalTime hem de LocalDateTime arasındaki farkı verir.

        // LocalTime
        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);

        Duration GunlukDersSuresi=Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);
        System.out.println("GunlukDersSuresi.toHours() = " + GunlukDersSuresi.toHours()); // fakrın toplam saat hslini
        System.out.println("GunlukDersSuresi.toMinutes() = " + GunlukDersSuresi.toMinutes()); // farkın toplam dakika halini
        System.out.println("GunlukDersSuresi.toMillis() = " + GunlukDersSuresi.toMillis()); // toplam farkın milisaniye hali

        // LocalDateTime ***2 tarih-saat arasındaki fark***
       LocalDateTime from =LocalDateTime.of(2023,1,1,0,0);
       LocalDateTime to=LocalDateTime.now(); // BUGÜN
        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());

    }
}
