package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gun ayyıl bilgisini tutar.
        LocalDate tarih=LocalDate.now(); // şu andaki zamanı verdi
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        // kendisindeki hazır formatlara bakalım.
        System.out.println("tarih.format(DateTimeFormatter.BASIC_ISO_DATE) = " + tarih.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("SHORT ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("SHORT ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("SHORT ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("SHORT ="+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n***********************");
        // localde aldığım tarihi istediğim ülkenin formatına göre diline göre nasıl gösteririm ?
        // örneğin locadldeki saati almanya ya nasıl gösteririz?
        System.out.println("Full almanya gösterimi =\n"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
        // lokalizasyon tanıumlaması
        // en-US birincisi dili ikincisi ülkeyi temsil ediyor. Amerikan
        // en-UK UK ingilizcesi
        // fr-CA kanada fransizcasi
        // en-CA kanada ingilzcesi
        // tr-TR türkçe Türkiye
        Locale[] kullanilabilirlokaller=Locale.getAvailableLocales();
        for (Locale l :kullanilabilirlokaller) {
    if (l.getDisplayCountry().toLowerCase().contains("chi")){
        System.out.println("Dil = "+l.getDisplayLanguage());
        System.out.println("Ülke = "+l.getDisplayCountry());
        System.out.println(",  "+l.getLanguage());
        System.out.println(" - "+l.getCountry());
            }
        }
        Locale lokalCince=new Locale("zh","CN");
        System.out.println("FULL çince gösterimi =\n"+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("\n*************İstediğim formatta gösterim*****************");
        //istediğim formatta gösterim
        System.out.println("tarih = "+tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Tarih dd/MM/yyyy = "+tarih.format(ozelFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("d.m.yy");
        System.out.println("tarih d.M.yy = "+tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy= "+tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(oz4));

        System.out.println("ozel format ve loc EEEE dd.MM.yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz5));


        System.out.println("\n***************");
        //Kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz, int sayi=5

        LocalDate tarih1= LocalDate.of(2000,5,20);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH, 12);
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));
    }
}
