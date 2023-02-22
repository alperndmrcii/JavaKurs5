package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMetod {
    public static void main(String[] args) {
// Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku=new Scanner(System.in);
        int[]dizi=new int[5];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i+"Sayi = ");
            dizi[i]= oku.nextInt();
                    }
        System.out.println(Arrays.toString(dizi));

        enkucukyaz(dizi);
        enbuyukyaz(dizi);
    }
    public static void enkucukyaz(int[] dizi){
    Arrays.sort(dizi);
        System.out.println("enkücük = "+dizi[0]);

    }
    public static void enbuyukyaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("enbüyük = " + dizi[dizi.length-1]);
    }
}
