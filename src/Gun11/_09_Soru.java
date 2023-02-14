package Gun11;

import java.util.Scanner;

public class _09_Soru {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.
/*
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayıyı tahmin ediniz = ");
        int tahmin= oku.nextInt();
        int randomsayi=(int) (Math.random()*3);
        if (tahmin==randomsayi)
            System.out.println("Tebrikler Bildiniz");
        else
            System.out.println("Yeniden Deneyin"); */

/////////// Hocanın yaptığı

        Scanner oku=new Scanner(System.in);
        System.out.println("Üretilecek Sayı Sınırı = ");
        int sinir= oku.nextInt();
        int tutulansayi=(int)(Math.random()*sinir);
        System.out.println("Tahmininiz = ");
        int tahmin= oku.nextInt();
        if (tahmin==tutulansayi)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedin ki bilemedin ki");













    }
}
