package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        // tipi adı ve ilk değeri işlem tamam bu adımı çalıştır
        int sayi=0;
        Scanner okuyucu = new Scanner(System.in);
        // tipi adı yeni okuyucu (klavyeden-konsoldan)
        System.out.print("Sayi Giriniz =");
        sayi = okuyucu.nextInt(); // kursor bekliyor sayi girisi için
        // rakam girilip entera basıldığında değeri alıp sayiya atıyor
        System.out.println("sayi = " + sayi);


    }
}
