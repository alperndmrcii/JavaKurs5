package Gun07;

public class _09_StringToLowerCase  {
    public static void main(String[] args) {

        // Girilen Stringi küçük harfe çeviriyor.

        String text="Merhaba Dünya";
        System.out.println("text.tolowercase = " + text.toLowerCase()); // merhaba dünya

        System.out.println("me ile veya ME ile başlıyor mu ? = " + text.toLowerCase().startsWith("me"));
        // önce me ile başlayıp başlamadığını bilmek için önce küçülttük sonra kontrol ettik.
        // Yani büyük küçük duyarlılığını ortadan kaldırdık.












    }
}
