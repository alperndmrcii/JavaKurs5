package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {

     /*   // Kullanıcının 2 kez gireceği şifrenin aynı olduğunu
        // Aynı ise EVET değil ise HAYIR şeklinde yazdıırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Şifrenizi Giriniz = ");
        String sifre= oku.nextLine();
        System.out.println("Şifrenizi Doğrulayınız = ");
        String sifre2= oku.nextLine();
        boolean ayniMi=sifre.equals(sifre2);

        if (ayniMi==true)
            System.out.println("Şifreler Aynı");

        if (ayniMi==false)
            System.out.println("Şifreler Uyuşmuyor"); */
        //////////////////////////////////////////
        Scanner oku=new Scanner(System.in);
        System.out.println("Şifrenizi Giriniz = ");
        String sifre= oku.nextLine();
        System.out.println("Şifrenizi Doğrulayınız = ");
        String sifre2= oku.nextLine();

        if (sifre.equals(sifre2))
            System.out.println("Sifreler aynı");

        if (!sifre.equals(sifre2))
            System.out.println("Sifreler uyuşmuyor");























    }
}
