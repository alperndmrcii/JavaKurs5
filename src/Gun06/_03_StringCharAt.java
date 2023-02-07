package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {

        // istenilen noktadaki karakteri verir
        // karakterlerin sırası 0 dan başlar ve buna index denir.


        String cumle="Konuşmayacaktın hain kostok artık ağzının yerini biliyorum"; // lengt 13 ama karakterlerin odası 0-12 dahil

        char ilkharf=cumle.charAt(0); // 0 indexteki harfi ver demek.

        System.out.println("ilkharf = " + ilkharf);
    }
}
