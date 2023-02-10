package Gun08;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class _08_Soru2 {
    public static void main(String[] args) {

            // Girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int sayi= oku.nextInt();
        int kalan= sayi % 2; // bu 1 e eşitse sayı tek
        System.out.println("tek mi ?"+ (kalan==1));

// negatif girilme sebebi ile en doğru olan yazım şekli
        System.out.println("Tek mi ? "+ (sayi%2!=0));





























    }
}
