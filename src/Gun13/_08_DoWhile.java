package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {
// x ifadesi girilinceye kadar program çalışıyor yazan x yazdıktan sonra program bitti diyen kodu yazınız.
        Scanner oku=new Scanner(System.in);
        String okunan="";
        do {
            System.out.print("ifade Giriniz = ");
            okunan=oku.next();

            System.out.println("Program Çalışıyor.");
        }while (!okunan.equalsIgnoreCase("x"));
        System.out.println("Program Bitti");

    }
}
