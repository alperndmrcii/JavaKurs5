package Gun08;

import java.util.Scanner;

public class _09_Soru3 {
    public static void main(String[] args) {

        // Girilen bir cümledeki ilk kelimeyi yazdırnız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir Cümle Griniz = ");
        String cumle= oku.nextLine();
        int boslukIndex=cumle.indexOf(" ");
        String ilkkelime=cumle.substring(0,boslukIndex);
        System.out.println("ilkkelime = " + ilkkelime);

        // bugün hava sıcak






















    }
}
