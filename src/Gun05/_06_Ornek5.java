package Gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        /// bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a alan= a*a
        Scanner oku= new Scanner(System.in);
        System.out.print("Karenin bir kenarının uzunluğunu giriniz =");
        int kenar=oku.nextInt();
        int cevre=kenar+kenar+kenar+kenar;
        System.out.println("Karenin Çevresi = " + cevre);
        int alan=kenar*kenar;
        System.out.println("alan = " + alan);
    }
}
