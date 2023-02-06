package Gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        /// bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırnız.
        // cevre=a+b+a+b alan a*b

        /*Scanner oku= new Scanner(System.in);
        System.out.println("Uzunkenar =");
        System.out.println("Kisakenar =");
        int uzunkenar= oku.nextInt();
        int kisakenar= oku.nextInt();
        int cevre=uzunkenar+kisakenar+uzunkenar+kisakenar;
        System.out.println("Dikdörtgenin Çevresi = " + cevre);
        int alan=uzunkenar*kisakenar;
        System.out.println("Dikdörtgenin Alanı = " + alan); */

        Scanner oku=new Scanner(System.in);
        System.out.println("dikdörtgenin kısa kenari");
        int kisakenar= oku.nextInt();
        System.out.println("dikdörtgenin uzun kenari");
        int uzunkenar= oku.nextInt();
        int cevre=kisakenar+uzunkenar+kisakenar+uzunkenar;
        int alan=kisakenar*uzunkenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
