package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {

        // Stringlerde neden == yerine equal kullanılıyor ?


        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";
        // ilkel tipleri karşılaştırdığından 2 sinde de değerşeri karşılaştırır.
        // çünkü başka bir şeyi yok
        if (cumle1==cumle2)
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit değil");
        if (cumle1.equals(cumle2))
            System.out.println("cümle 1 cümle 2 ye eşit");
        else
            System.out.println("cümle 1 cümle 2 ye eşit değil");

        /**************** Referenas Tiplerde ise Durum ********************/
        /**************** Scanner ile ekrandan okunduğunda aşağıdaki gibi oluyor **************/
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");
        if (cumle3==cumle4) // adresleri karşılaştırır
            System.out.println("cümle 3 cümle 4  e eşit");
        else
            System.out.println("cümle 3 cümle 4  e eşit değil ");
        if (cumle3.equals(cumle4)) // değerleri aynı mı
            System.out.println("cümle 3 cümle 4 e eşit");
        else
            System.out.println("cümle 3 cümle 4 e eşit değil");

    }
}
