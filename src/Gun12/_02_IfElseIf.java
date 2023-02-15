package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        //Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi = ");
        int s1= oku.nextInt();
        System.out.print("2.sayi = ");
        int s2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Cıkarma için C");
        System.out.println("Carpma  için P");
        System.out.println("Bölme  için B");
        System.out.print("Seçiminiz = ");
        Scanner okuStr=new Scanner(System.in);
        String secim=okuStr.next();
        if (secim.equalsIgnoreCase("T"))
            System.out.print("toplam = "+ (s1+s2));
        else
            if (secim.equalsIgnoreCase("C"))
                System.out.print("Farkı = "+(s1-s2));
            else
                if (secim.equalsIgnoreCase("P"))
                    System.out.print("Çarpımı = "+(s1*s2));
                else
                    if (secim.equalsIgnoreCase("B"))
                        System.out.print("Bölümü = "+ (s1/s2) );
                    else
                        System.out.println("Yanlış Seçim");



























    }
}
