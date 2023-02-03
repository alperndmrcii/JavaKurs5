package Gun02;

public class _04_EscapeCharacters {
    public static void main(String[] args) {
        // Escape Characters
        // \n ---> yeni satır açıyor, alt satıra geçiyor
        // \t ---> sanki tab tuşuna basılmış gibi boşluk veriyor.
        // \b ---> backspace bir karakter geri alma yapar (siler)
        // \" ---> tırnak yazmak için kullanılıyor.
        // \\ ---> ekrana \ yazdırmak için kullanılıyor.
        // \r ---> satırın başına geri döner ve satırı silip tekrar baştan yazıyormuş gibi yapar.

        System.out.println("merhabadunya"); // merhaba dunya
        System.out.println("merhaba\ndunya");
        // merhaba alt satıra geçer dunya
        // print veya println \ görünce bu ekrana yazılacak bir karakter değil ayrı
        // bir iş yapmam isteniyor devam eden n karakterini görünce
        // ayrı işin alt satıra geçmek olduğunu anlıyor.

        System.out.println("merhaba\tdunya"); // merhaba    dunya
        System.out.println("merhaba\bdunya"); // merhabdunya
        System.out.println("\"merhabadunya\""); // "merhabadunya"
        System.out.println("merhaba\\dunya"); // merhaba\dunya
        System.out.println("merhaba\rdunya"); // dunya


    }
}
