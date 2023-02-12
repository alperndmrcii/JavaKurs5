package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // Baklava Dilimi ---> if
        // Girilen bir sayı 10 büyük ise ekrana 10dan büyük yazdırınız.
        // algoritma
        // 1- basla
        // 2- sayi oku sayi=oku.nextInt()
        // 3- sayi>10 ise "10dan büyük" yaz -> if (sayi>10) sout....
        // 4- dur
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();

        if (sayi>10)
        { // if şartı sağlandıında yapılacaklar parantezi//

            System.out.println("10 dan büyük");

        }
        if (sayi<10) {
            System.out.println("10 dan küçük");
        }

        if (sayi==10)
        {
            System.out.println("10a eşit");
        }











    }
}
