package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcı 0 değerini girene kadar girdiği sayıların toplamını bulnuz.
        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;
        System.out.print("Bir sayı giriniz = ");
        sayi= oku.nextInt();
        while (sayi !=0)
        {
            System.out.print("Sayı Giriniz = ");
            sayi= oku.nextInt();
            toplam=toplam+sayi;
        }
        System.out.print("toplam = "+toplam);














    }
}
