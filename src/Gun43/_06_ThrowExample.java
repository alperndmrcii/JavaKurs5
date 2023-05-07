package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni bir şifre oluşturun");

        System.out.print("yeni şifreniz ");
        String newPassword= oku.nextLine();
        if (newPassword.length()<8){
            System.out.println("lütfen dikkat !");
        System.out.println("şifre en az 8 karakterden oluşmalıdır !");}
        if (newPassword.length()>15){
            System.out.println("lütfen dikkat !");
        System.out.println("şifre en fazla 15 karakterden oluşmalıdır !");}
        // log tutma

    }
}
