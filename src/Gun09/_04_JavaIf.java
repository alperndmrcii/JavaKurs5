package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        /// Girilen bi sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz = ");
        int sayi= oku.nextInt();

        if (sayi%2 !=0)
            System.out.println("Tek");

        if (sayi%2 == 0)
        System.out.println("Çift");













    }
}
