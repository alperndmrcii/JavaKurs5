package Gun06;

import java.util.Scanner;

public class _06_Soru2 {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Ismet Temur" I.T şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("İsminizi ve Soyisminizi Giriniz=");
        String adsoyad= oku.nextLine(); // ad soyad veri olarak alındı.
        // Ismet Temur --> I.T
        // I---> charAt(0) I.
        // indexOf(" ") boşluğun indexini veriyor, bunun 1 fazlası soyadının ilk harfini verir.
        char ilkharf=adsoyad.charAt(0); // I
        int boslukIndex=adsoyad.indexOf(" ");
        char soyadilkharf=adsoyad.charAt(boslukIndex+1);
        System.out.println(ilkharf+"."+soyadilkharf+".");
    }
}
