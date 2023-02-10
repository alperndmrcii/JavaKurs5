package Gun07;

public class _07_StringStartsWith {
    public static void main(String[] args) {

        // StartsWith : bununla başlıyor mu ?
        // sonuç true veya false
        String text="HCL Teknoloji";
        System.out.println("text.startswith(HC) = " + text.startsWith("HC")); // true olacak
        System.out.println("text.startswith(te) = " + text.startsWith("te")); // false olacak çünkü te ile başlamıyor HC ile başlıyor
        System.out.println("text.startswith(hc) = " + text.startsWith("hc")); // HC ile başlıyor ancak büyük küçük harf duyarlı o yüzden false











    }
}
