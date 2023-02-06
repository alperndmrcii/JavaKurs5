package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        // sayi=oran; yazsaydık tehlikeli iş yapıyorsun bundan dolayı veri kaybı olur
        // değerlere bak, oluşan veri kaybını anladıysan ve kabul ettiysen bana bunu bilerek yaptığını göster.
        //o yüzden neyden dönüştürdüğümüzü yazıyoruz
        sayi=(int) oran;
        System.out.println("sayi = " + sayi);
        // örnekte olduğu gibi oran ilk başta 3.2 iken yaptığımız değişiklik yüzünden cevabımız 3 olarak çıktı 0.2 veri kaybına uğradı.

        //**********************************************************************************************************************************************/

        byte kisakenar=5;
        byte uzunkenar=7;
        byte cevre= (byte) (kisakenar+uzunkenar+kisakenar+uzunkenar);
        //sen eşitliğin 2.tarafı rakamlar toplandı, benim tomplam burada int durumunda(çünkü sayılar default olarak int).
        //byte cevre=5+7+5+7; // int'i ---> byte atmaya çalışıyorsun.
        //eğer veri kaybı olmayacağından eminsen veya önemli değilse bana bunu yazarak göster.
        int cevre2=kisakenar+uzunkenar+kisakenar+uzunkenar;
        System.out.println("cevre = " + cevre);
        System.out.println("cevre2 = " + cevre2);

    }
}
