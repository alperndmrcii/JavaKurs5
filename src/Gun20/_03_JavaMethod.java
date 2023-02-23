package Gun20;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {
        //kullanıcıdan gireceği bir sayıya kadar olan sayıların çarpımını(fakötriyel)
        // bir fonksiyonda buldurup bunun sonucu mainde tek mi çift mi olduğunu yazdırnız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");
        int sayi = oku.nextInt();

        int carpim = faktoriyel(sayi);
        System.out.println("Carpım = "+carpim);

        if (carpim%2==0)
            System.out.println("çift");
        else
            System.out.println("tek");

    }

    public static int faktoriyel(int sayi) {
        int carpim = 1;
        for (int i = 1; i <= sayi; i++) {
            carpim = carpim * i;
        }
        return carpim;
    }
}
