package Gun05;

import java.util.Scanner;

public class _05_Ornek4 {
    public static void main(String[] args) {

        /// KULLANICIDAN ALACAĞINIZ 2 TAM SAYININ TOPLAMINI EKRANA YAZDIRINIZ.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi 1 =");
        int sayi1=oku.nextInt();
        System.out.print("Sayi 2 =");
        int sayi2= oku.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);





    }
}
