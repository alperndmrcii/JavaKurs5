package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0; // 1 tane sayı
        int[] dizi=new int[100]; // 100 tane sayı

        int[] ders1notlari=new int[50]; // 50 kişilik sınıfın matematik notları;
        int[][] tumDersNotlari=new int[3][50]; // 3 tane ders 50 tane öğrenci toplam 150 sayı tutuyor.
                                            // 3 satır 50 sütun yani
                                            // her satır 50 tane sayı, 50 sütun.
                                            // 0.satır 1.satır 2.satır
                                            // satir 0,1,2 sütun 0,1,2,3,........49

        ders1notlari[0]=80; // tek boyutlu dizinin 1lk (0) elemanına 80 değerini atadım
        System.out.println("tumDersNotlari[0][0] = "+tumDersNotlari[0][0]);
        Scanner oku=new Scanner(System.in);
        tumDersNotlari[0][0]= oku.nextInt();

    }
}
