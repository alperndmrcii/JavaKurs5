package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

        // girilen sorunun negatifm i pozitif mi olduğnu yazdrınız 0 ise sıfır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Griniz= ");
        int sayi= oku.nextInt();
        if (sayi > 0)
            System.out.println("Sayi pozitif");

        if (sayi < 0)
            System.out.println("Sayı Negatif");

        if (sayi==0)

            System.out.println("Sayi = 0");











    }
}
