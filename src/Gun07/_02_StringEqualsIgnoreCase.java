package Gun07;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {


        String s1="Merhaba";
        String s2="MERHABA";
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // Equals ile aynı çalışır sadece büyük küçük harfi dikkate almaz
        System.out.println("s1.equals(s2) = " + s1.equals(s2));  // Büyük Küçük harfe duyarlıdır Merhaba ve merhaba kelimelerini aynı olarak kabul etmez.


    }
}
