package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

            // 50 öğrenci var hepsinin intlerini tek tek yazıp ortalamasını alıp sonucu vermek çok uzun

        int ogrnot;
        int ogrnot2;
        int ogrnot3;
        //....
        //...
        int ogrnot50;

        //bana bir tanımlamada birden fazla değer tutabilen bir değişken gerekiyor.
        // ÇÖZÜM:
        int[] notlar =new int[50];// 50 tane int saklayabilen notlar isimli değişken.

        notlar[0]=75;
        notlar[1]=88;
        //...
        //...
        //...
        notlar[49]=95; // en son eleman toplam eleman sayısı -1 yani lenght-1 dir böylece 0-49 indextir.
        //System.out.print("notlar = "+notlar[0]);

        Scanner oku=new Scanner(System.in);
        for (int i=0;i<notlar.length;i++){
            System.out.print(i+".Notu Giriniz = ");
            notlar[i]=oku.nextInt();}
        for (int i=0;i<notlar.length;i++)
        {
            System.out.println(notlar[i]);
        }






    }
}
