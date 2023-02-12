package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // Girilen iki sayıdan büyük olanının değerini ekrana yazdırınız
        // eşit ise eşit yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("İki Sayi Giriniz = ");
        int sayi1= oku.nextInt();
        int sayi2= oku.nextInt();
        if (sayi1>sayi2)
            System.out.println("Sayi 1 daha büyük " + sayi1);
        if (sayi2>sayi1)
            System.out.println("Sayi 2 daha büyük "+ sayi2);
        if (sayi1==sayi2)
            System.out.println("Eşit");











    }
}
