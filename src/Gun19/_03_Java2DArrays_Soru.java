package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays_Soru {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];
        for (int i = 0; i <tablo.length; i++) {
            for (int j = 0; j <tablo[i].length; j++) {
                System.out.print("Sayi giriniz = ");
                tablo[i][j] = oku.nextInt();
                            }

        }
        int tekelemanlar=0;
        for (int i = 0; i <tablo.length ; i++) {
            for (int j = 0; j <tablo[i].length ; j++) {
                if (tablo[i][j]%2==1)
                    tekelemanlar++;
                         }
             }
        int [] teklerDizisi=new int[tekelemanlar]; // teklerin miktarı kadar bir dizi tanımlandı
        tekelemanlar=0;
        for (int satir=0;satir<tablo.length;satir++){
            for (int sutun=0;sutun<tablo[satir].length;sutun++){
                if (tablo[satir][sutun]%2!=0){
                    teklerDizisi[tekelemanlar]=tablo[satir][sutun];
                    tekelemanlar++;
                }
            }

        }
        System.out.println(Arrays.toString(teklerDizisi));
        }
    }
