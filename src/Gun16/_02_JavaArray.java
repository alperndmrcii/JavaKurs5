package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük kaç not olduğunu bulunuz ve bunları yazdırınız.

        int[] notlar=new int[5]; // 50 tane int kutusu oluşturuldu
        Scanner oku=new Scanner(System.in);
        int toplam =0;
        for (int i=0;i<notlar.length;i++)
        {
            System.out.print(i+".notu Giriniz = ");
            notlar[i]=oku.nextInt();
            toplam=toplam+notlar[i];
        }
        int ortalama=toplam/notlar.length;


        for (int i=0;i<notlar.length;i++)
        {
        if (notlar[i] > ortalama)
            {
                System.out.println("ortalamadan büyük notlar = " + notlar[i]);}
        }
        System.out.print("Ortalama= "+ortalama);

    }

    }

