package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // kullacının gireceği 2 sayının birbirine eşit mi olup olmadığını yazdınırız.

        Scanner oku=new Scanner(System.in);
        System.out.println("2 Sayı giriniz");
        int sayi1= oku.nextInt();
        int sayi2= oku.nextInt();
        System.out.println("sayi1 eşit mi sayi2 ? "+ (sayi1==sayi2));

        /////////////////////////////////////

        /* Scanner oku=new Scanner(System.in);
       System.out.print("Birinci Sayi=");
       int sayi1=oku.nextInt();

       System.out.print("İkinci Sayi=");
       int sayi2=oku.nextInt();

       System.out.print("Eşit mi ?" + (sayi1==sayi2) ,);

       2.YÖNTEM
       boolean esitMi=(sayi1==sayi2);
       System.out.print("esitMi = " + esitMi);

         */


























    }
}
