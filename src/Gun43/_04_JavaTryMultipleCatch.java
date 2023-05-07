package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("program başladı");

        try {


            Scanner oku = new Scanner(System.in);
            System.out.print("sayi 1 = ");
            int sayi1 = oku.nextInt();

            System.out.print("sayi 2 = ");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bölüm = " + bolum);


            System.out.println("program bitti");
        }catch (InputMismatchException ex) // belirli bir hata
        {
            System.out.println("lütfen sayı giriniz = ");
        }
        catch (ArithmeticException ex) // belirli bir hata
        {
            System.out.println("sıfıra bölme hatası");
        }
        catch (Exception ex) // yukardakilerin dışında hatalar için
        {
            System.out.println("hata oluştu "+ex.getMessage()   );
        }
    }
}
