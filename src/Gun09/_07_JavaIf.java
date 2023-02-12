package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cümle Griniz = ");
        String cumle= oku.nextLine();
        cumle= cumle.toUpperCase(); // System.out.println(cumle.toUpperCase());
        if (cumle.contains("a"))
            System.out.println("Var");

        if (!cumle.contains("a"))
            System.out.println("Yok");







    }
}
