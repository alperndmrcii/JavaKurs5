package Gun13;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {

        // Girilen 20 sayıdan sadece çift olanları toplayınız
        Scanner oku= new Scanner(System.in);
        int sayac=1;
        int toplam=0;
        while (sayac<=20) {
            System.out.print(sayac+".Sayı giriniz = ");
            int sayi= oku.nextInt();
            if (sayi%2==0)
                toplam=toplam+sayi;
                sayac=sayac+1;
        }
        System.out.println("Toplam= "+ toplam);

















    }
        }
