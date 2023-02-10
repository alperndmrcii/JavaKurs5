package Gun07;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // Girilen bi ad soyadın (tam ad) adını ve soyadını ayırıp ayrı ayrı yazınız.

       /* Scanner oku=new Scanner(System.in);
        System.out.print("Adınızı Soyadınızı Giriniz = ");
        String isimsoyisim= oku.nextLine();
        int bosluIndex=isimsoyisim.indexOf(" ");
        String ad=isimsoyisim.substring(0, bosluIndex);
        String soyad=isimsoyisim.substring(bosluIndex+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad); */

        Scanner oku=new Scanner(System.in);
        System.out.println("Adınızı soyadınızı giriniz = ");
        String isimsoyisim= oku.nextLine();
        int boslukIndex=isimsoyisim.indexOf(" ");
        String ad=isimsoyisim.substring(0, boslukIndex);
        String soyad=isimsoyisim.substring(boslukIndex+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);



    }
}
