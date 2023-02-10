package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {
        // isEmpty bir stringin içinde bir şey var mı yok mu boolean olarak veerir.

        String s1="Merhaba";
        System.out.println("s1.IsEmpty() = " + s1.isEmpty()); // false gelecek çünküü içinde merhaba yazmaktadır

        String s2=""; // şuan boş olarak görünür çünkü içinde karakter yok
        System.out.println("s2.isempty = " + s2.isEmpty());

        String s3=" "; // şuan boş değil çünkü tırnaklar arası boşluk var yani içerde boşluk olmakta ve boş değil.
        System.out.println("s3.isempty = " + s3.isEmpty());
    }
}
