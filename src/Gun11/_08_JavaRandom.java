package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {

        // Math.random() : double sayı üretir 0*0.999999999 arası bir sayı üretir

        double randomsayi=Math.random();
        System.out.println("randomsayi = " +randomsayi);

        // 0-6 arası üretsin
        // 6 ile çarparım
        // 0-5.999999999 arası bi sayı
        // int çevirirsem 0-5;
        int randomtamsayi= (int) (Math.random()*6);
        System.out.println("random tam sayi" +randomtamsayi);


















    }
}
