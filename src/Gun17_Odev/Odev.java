package Gun17_Odev;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random olarak doldurduktan sonra kullanıcının gireceği bir rakamı arattırınız bu rakam var ise indexini yazdrırınız.

        int[] dizi=new int[10];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int) (Math.random()*11);
        }
        System.out.println(Arrays.toString(dizi));
        Scanner oku=new Scanner(System.in);
        System.out.println("aranacak sayi =(0-10) ");
        int arananrakam= oku.nextInt();

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]==arananrakam)
                System.out.println("eleman var "+i+" indexte");

        }




        }

    }

