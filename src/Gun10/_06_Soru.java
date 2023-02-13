package Gun10;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // Bir şifre belirleyin en az 8 karakter olmalı, içinde pass kelimesi olmamalı, en fazla 12 karakter olmalı.

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifrenizi belirleyiniz = ");
        String sifre= oku.nextLine();

        if (sifre.contains("pass")||sifre.length()<8||sifre.length()>12)
        System.out.println("Geçersiz Şifre");

        else
        System.out.println("Şifre Başarılı");

      /*  Scanner oku=new Scanner(System.in);
        System.out.println("Şifre = ");
        String sifre= oku.nextLine();
        if (sifre.length()>=8 && sifre.length() <=12 && !sifre.toLowerCase().contains("pass"))
            System.out.println("Uygun");
        else
            System.out.println("uygun değil");
*/



}





















    }
