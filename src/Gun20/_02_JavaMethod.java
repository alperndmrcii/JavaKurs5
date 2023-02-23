package Gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // kullanıcıdan gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda yaptıktan sonra maine atınız

        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi= ");
        int sayi1= oku.nextInt();

        System.out.println("2.sayi= ");
        int sayi2= oku.nextInt();

        int anb=enbBul(sayi1,sayi2);
        System.out.println("anb= "+anb);

    }
    public static int enbBul(int s1, int s2){
       /* int donecek=0;
        if (s1>s2)
            donecek=(s1);
        else
            donecek=(s2);
        return donecek;

        // 2.YÖNTEM
        return s1>s2 ? s1 : s2; */
        // 3.YÖNTEM
        if (s1>s2)
            return s1;
        else
            return s2;
    }
}
