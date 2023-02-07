package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // bugün : harflerin oda numaraları 0dan başlar : index.
        // 01234

        String cumle="merhaba dünya";
        // d nin indexi kaç
        // m nin indexi kaçtır
        // 0 (506) 3445567 --> ( in oda numarası kaç ?.
        System.out.println("cumle.indexof m = " + cumle.indexOf("m"));
        System.out.println("cumle.indexof a = " + cumle.indexOf("a"));
        System.out.println("cumle.indexof ha = " + cumle.indexOf("ha"));
        System.out.println("cumle.indexof dünya = " + cumle.indexOf("dünya"));
        System.out.println("cumle.indexof( ) = " + cumle.indexOf(" "));
        System.out.println("cumle.indexof A = " + cumle.indexOf("A")); // bu harf olmadığı için bize -1 verecek.
        System.out.println("cumle = " + cumle.indexOf("a",5)); // a yı aramaya 5 dahil nolu indexten sonra başla.
    }
}
