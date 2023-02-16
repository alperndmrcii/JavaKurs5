package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {



        // Kullanıcı 0 değerini girene kadar girdiği sayıların toplamını bulnuz.

        Scanner oku=new Scanner(System.in);

        int sayi;
        int toplam=0;


        do { // Döngü arası şartbaşta olmadığından en az 1 kez çalşır, kontrol sonda

            System.out.println("sayi giriniz = ");
            sayi=oku.nextInt();
            toplam=toplam+sayi;


        }while (sayi!=0);
        System.out.println("toplam = "+toplam);
    }
}
