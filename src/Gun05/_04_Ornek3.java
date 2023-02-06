package Gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("Adınızı Giriniz =");
        String ad=oku.next();
        Scanner soyadoku= new Scanner(System.in);
        System.out.print("Soyadınızı Giriniz =");
        String soyad=soyadoku.next();
        System.out.println("Adınız ve Soyadınız = " + ad + "  " + soyad);

        /////////////////////////////////////////////////////////////////////////


        /* Scanner.oku=new Scanner(System.in);
           System.out.print("Adınız");
           String ad=oku.next();
           System.out.print("Soyadınız");
           String soyad=oku.next();
           System.out.println("ad = " + ad);
           System.out.println("soyad = " + soyad);
           System.out.println("Adınız ve Soyadınız="+ad+" "+soyad);

         */
    }
}
