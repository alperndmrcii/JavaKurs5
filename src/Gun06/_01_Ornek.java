package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {


        ///////// Cadde sokak posta kodu ulkeyi giren ve adresi yazdıran programı yazdırınız.
        Scanner okuStr=new Scanner(System.in); // String okumalarını yap.
        Scanner okuInt=new Scanner(System.in); // Int okumalarını yap.
        System.out.print("Cadde =");
        String cadde= okuStr.nextLine();
        System.out.print("Sokak =");
        String sokak= okuStr.nextLine();
        System.out.print("Posta Kodu =");
        int postakodu= okuInt.nextInt();
        System.out.print("Ulke");
        String ulke= okuStr.nextLine();
        System.out.println("Adres="+cadde+" "+sokak+" "+postakodu+" "+ulke);




    }
}
