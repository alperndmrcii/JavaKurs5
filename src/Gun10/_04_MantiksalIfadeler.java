package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal ifadeler
        // && bu ve işaretimizdir.
        // || veya işaretimiz.
        // Girilen sayı pozitif ve tek ise ekrana uygun sayı girildi değilse uyhun sayı girilmedi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi=oku.nextInt();
        if (sayi%2==1 && sayi>0)
            System.out.println("Uygun sayi girildi");
        else
            System.out.println("Uygun sayi girilmedi");

























    }
}
