package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {
        // kullanınıcn gireceği bir rakama kadar olan sayıların toplamını yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");
        int sayi= oku.nextInt();
        int toplam=0;
        for (int i=1;i<=sayi;i++)
            toplam=toplam+i;
            System.out.println("Toplam = "+toplam);




    }
}
