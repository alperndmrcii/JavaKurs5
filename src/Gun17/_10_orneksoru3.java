package Gun17;

import java.util.Scanner;

public class _10_orneksoru3 {
    public static void main(String[] args) {
        // Girilen 3 bassamaklı bir sayının birler onlar ve yüzler basamağını bulunuz.


        Scanner oku=new Scanner(System.in);
        System.out.println("sayi ghiriniz = ");
        int sayi= oku.nextInt();
        int basamak;
        int sayac=1;

        while (sayi > 0){ //123

            basamak=sayi % 10 ;
            System.out.println(sayac+".basamağı : "+basamak);
            sayi/=10;
            sayac*=10;

        }




    }
}
