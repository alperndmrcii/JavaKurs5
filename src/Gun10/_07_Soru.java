package Gun10;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının birbirine eşit olup olmadığını bulunuz
        // 46 67

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayiları bir boşluk bırakarak giriniz = ");
        String sayilar=oku.nextLine();

        int boslukIndex=sayilar.indexOf(" ");
        String strsayi1=sayilar.substring(0,boslukIndex);
        String strsayi2=sayilar.substring(boslukIndex+1);

        int sayi1=Integer.parseInt(strsayi1);
        int sayi2=Integer.parseInt(strsayi2);

        if (sayi1==sayi2)
            System.out.println("eşit");
        else
            System.out.println("değil");














    }
}
