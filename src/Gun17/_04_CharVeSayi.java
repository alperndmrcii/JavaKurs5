package Gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {

        int sayi=0;

        char harf=(char)sayi;
        harf=(char)sayi;

        for (int i = 0; i <255; i++) {
            harf=(char)i;
            System.out.println(i+".harf = " + harf);
        }
    }
}
