package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.
        Scanner oku=new Scanner(System.in);
        System.out.print("rakam = ");
        int aranacakrakam= oku.nextInt();
        int[]dizi=new int[10];
        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);

        }
        System.out.println(Arrays.binarySearch(dizi,aranacakrakam));




    }
}
