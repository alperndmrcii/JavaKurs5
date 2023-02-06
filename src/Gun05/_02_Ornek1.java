package Gun05;

import java.util.Scanner;

public class _02_Ornek1 {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırnız
        Scanner okuyucu=new Scanner(System.in);
        System.out.print("Adınızı Giriniz=");
        String ad=okuyucu.nextLine(); // next() bir kelime okur.
        System.out.println("ad = " + ad);

        // okuyucu.next(); olduğunda bir kelime okur.
        //okuyucu.nextLine(); olduğunda satırın tümünü okur
        // okuyucu.nextInt(); int değeri okumak için
        // okuyucu.nextShort(); short değeri okumak için.
        //okuyucu.nextByte(); Byte değeri okumak için
        //okuyucu.nextLong(); long değeri okumak için
        // okuyucu.nextFloat(); Float değeri okumak için
        // okyucu.nextDouble(); Double değeri okumak için.

    }
}
