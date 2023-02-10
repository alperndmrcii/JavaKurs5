package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {
        // String Büyük harf ile yazar.

        String text="Merhaba Dünya";
        System.out.println("text.touppercase  = " + text.toUpperCase());
        System.out.println("Me veya me ile başlıyor mu = " + text.toUpperCase().startsWith("ME"));
        System.out.println("text = " +text);
        System.out.println("Me veya me ile başlıyor mu = " + text.toUpperCase().startsWith("me"));

    }
}
