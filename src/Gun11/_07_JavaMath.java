package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {




        // Math.max yöntemi ile girilen 3 sayıdan büyük olarnını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Üç adet sayı giriniz = ");
        int a= oku.nextInt();
        int b= oku.nextInt();
        int c= oku.nextInt();

        //1.Yöntem
        int enb=Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb = "+enb);
        //2.Yöntem
        int enb2=Math.max(a,Math.max(b,c));
        System.out.println("enb2"+enb2);








    }
}
