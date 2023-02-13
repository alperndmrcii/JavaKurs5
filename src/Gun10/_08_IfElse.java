package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında 1 boslukla gırılen 3 ınt sayının toplamlarının sonucunun tek mı cıft mı oldugunu bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.println("Aralarında bir bosluk birakarak 3 sayi giriniz = ");
        String sayilar= oku.nextLine();

        int boslukindex1=sayilar.indexOf(" ");
        int boslukindex2=sayilar.lastIndexOf(" ");

        // int boslukind2=sayilar.indexOf(" ",boslukindex1+1);

        int sayi1=Integer.parseInt(sayilar.substring(0,boslukindex1));
        int sayi2=Integer.parseInt(sayilar.substring(boslukindex1+1,boslukindex2));
        int sayi3=Integer.parseInt(sayilar.substring(boslukindex2+1));
        System.out.println(sayi1+sayi2+sayi3);
        if ((sayi1+sayi2+sayi3) % 2 ==0)
        {
            System.out.println("Çift"); }
        else
        {
            System.out.println("Tek");
        }





    }
}
