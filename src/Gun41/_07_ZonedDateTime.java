package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    public static void main(String[] args) {
        // Başka Zaman Bölgelerinin (Time Zone) zaman bilgisini alma
        ZonedDateTime zdt=ZonedDateTime.now();
        //Şu anda bulunduğum default Time Zone'u verdi
        System.out.println("zdt = " + zdt);
        Set<String> zamanBolgeleri= ZoneId.getAvailableZoneIds();
        for (String zone: zamanBolgeleri)
        {
            System.out.println("zone = " + zone);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime saatLondon =ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);

    }
}
