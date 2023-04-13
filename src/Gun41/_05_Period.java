package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // period iki tarih arasındaki farkı gösteririr
        // sadece  LocalDateler için kullanıyoruz

        LocalDate dogumtarihi=LocalDate.of(1938,11,10);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumtarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" Yaşındasınız");

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra=bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra=bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        //**********************************************************/
        //kursun bitiş tarihini bulunuz 6 ay - 31ekim 2022
        LocalDate kursBaslangic=LocalDate.of(2022,10,31);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursBaslangic.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
        // kursun bitmesine ne kadar süre kaldı
        Period neKadarSureKaldi=Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);
        // kurs ne kadar suredir devam ediyor
        Period suannekadaroldu=Period.between(kursBaslangic,bugun);
        System.out.println("suannekadaroldu = " + suannekadaroldu);
        
    }
}
