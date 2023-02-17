package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // Girilen bir sayının 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.

        // 4 firdim -> 2*2 tam kare
        // 5 girdi -> tam kare değil
        // 9 girdim -> tam kare 3*3
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi= oku.nextInt();
        int sayac=0;
        boolean tamkare=false;
        while (sayac<sayi)
        {
            if (sayac * sayac == sayi){
                tamkare=true;
                    System.out.print("Tam Karedir");
                    break;
            }

            sayac++;
        }
        if (tamkare==false)
            System.out.println("Tam Kare Değildir");






    }
}
