package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının girceği 2 sayının toplamını bir fonsiyonda buldurup bunun sonucunu mainde yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi= ");
        int s1= oku.nextInt();
        System.out.print("2.sayi = ");
        int s2= oku.nextInt();
        int toplam=toplamBul(s1,s2);
        System.out.println("toplam= "+toplam);


    }
    public static int toplamBul  (int sayi1, int sayi2){
        int toplam=sayi1+sayi2;
        return toplam;

    }
}
