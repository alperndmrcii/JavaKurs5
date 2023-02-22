package Gun18;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz

        int[][] tablo = new int[2][3];
        for (int satir = 0; satir < 2; satir++) { //
            for (int sütun = 0; sütun < 3; sütun++) {
                tablo[satir][sütun] = (int) (Math.random() * 100); // baştan bu noktaya kadar olan yerde bu işlemi yaptık = "random 100 e kadar sayılarla doldurunuz"
            }
        }
        int tekMiktar=0;
        for (int satir = 0; satir < 2; satir++) { //
            for (int sütun = 0; sütun < 3; sütun++) {
                System.out.print(tablo[satir][sütun]+"\t");
                if (tablo[satir][sütun]%2==1)
                    tekMiktar++;

            }
            System.out.println();
        }
        System.out.println("tekMiktar = " + tekMiktar);

    }

}




