package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni bir şifre oluşturun");

        System.out.print("yeni şifreniz ");
        String newPassword= oku.nextLine();

        try {
            if (newPassword.length() < 8)
                throw new Exception("Şifre en az 8 karakterden oluşmalı");
            if (newPassword.length() > 15)
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı");

        }catch (Exception ex)
        {
            // hatalar bir yede toplanıp hepsi için yapılması gereken işlemler bir arada
            //buarada yapılabilir. mesela log tuma gibi.
            System.out.println("Lütfen Dikkat !");
            System.out.println(ex.getMessage());
            // log tutma
        }


    }
}
