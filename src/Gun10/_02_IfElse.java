package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
//// Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
//        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
//        // bütünlemeye kaldınız şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("vize notunuzu giriniz ");
        System.out.print("Final notunuzu giriniz ");
        int vize= oku.nextInt();
        int finl= oku.nextInt();
        int ortalama= (vize+finl)/2;
        if (ortalama>=60){
            System.out.print("Geçtiniz ");
            System.out.print("Ortalamanız = " + ortalama); }
        else
            System.out.println("Bütünlemeye kaldınız");



























    }
}
