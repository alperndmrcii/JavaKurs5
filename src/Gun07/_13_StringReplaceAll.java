package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {

        // ReplaceAll: Replace gibi çalışır farkı Kriter(regex) verebiliyor.
        String text="Merhaba Dünya";
        System.out.println("text = " + text); // orjinal hali

        System.out.println("text.replaceAll[abn] = " + text.replaceAll("[abn]","_"));
        // a veya b veya n leri _ yap demek oluyo bu.

        System.out.println("text = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar olan büyük harfleri _ yap

        System.out.println("text = " + text.replaceAll("[0-9]",""));
        // Rakamları sil

        System.out.println("text = " + text.replaceAll("[^0-9]",""));
        // Rakamların dışındakileri sil 123












    }
}
