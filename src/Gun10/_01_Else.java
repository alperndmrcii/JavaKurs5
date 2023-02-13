package Gun10;

import java.util.Scanner;

public class _01_Else {
    public static void main(String[] args) {

        // Girilen bir öğrenci notuna göre 50den büyük eşit ise gfeçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Notu giriniz");
        int ogrNot= oku.nextInt();

        if (ogrNot >=50)
            System.out.println("Geçtiniz");

        if (ogrNot<50)
            System.out.println("Kaldınız");

        // 2.YÖNTEM : OLMASI GEREKEN.


        if (ogrNot>=50)
            System.out.println("Geçtiniz");
        else
            System.out.println("Kaldınız");



























    }
}
