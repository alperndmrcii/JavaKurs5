package Gun12;

import java.util.Scanner;

public class _06_Soru_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz = ");
        int sayi= oku.nextInt();
        int birlerbasamagi=sayi%10;
        switch (birlerbasamagi)
        {
            case 0: System.out.println("Sıfır"); break;
            case 1: System.out.println("Bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("üç"); break;
            case 4: System.out.println("dört"); break;
            case 5: System.out.println("beş"); break;
            case 6: System.out.println("altı"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
            default: System.out.println("Geçersiz");

            // KURAL : bir sayıdan herhanghi bir rakamı almak istiyosan : istediğin rakam sonda kalacak şekilde böl
                // Sonra da modül 10 al



        }
    }
}
