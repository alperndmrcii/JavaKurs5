package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        ///girilen bir stringin son harfini yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle= oku.nextLine();
        int uzunluk=cumle.length();
        char sonharf=cumle.charAt(uzunluk-1);
        System.out.println("sonharf = " + sonharf);
        // 2.yöntem
        // System.out.println("son harf="+cumle.charAt(cumle.lenght() -1)  );

    }
}
