package Gun17;

import java.util.Scanner;

public class _11_Orneksoru4 {
    public static void main(String[] args) {

        // bir sayı bulmaca oyunu yapılmak ıstenıyor bılgısayar 10-20 arası bır sayı tutsun kıllanıcı bu sayıyı bulmaya calıssın kullanıcının bu sayıyı bulmak ıcın 3 hakkı olsun.
        // 3 hakkın sonunda bılemez ıse bılmedıgnız yazıp tutulan sayıyı bıldırsın eger bılırse tebrıkler yazsın

        Scanner oku=new Scanner(System.in);
        int tutulansayi=(int)(Math.random()*(20-10))+10;
        int tahminedilensayi;
        int sayac=1;

        do {
            System.out.print("sayi tahmin ediniz = ");
            tahminedilensayi= oku.nextInt();
            if (tahminedilensayi==tutulansayi){
                System.out.println("Tebrikler !");break;
            }else if (tahminedilensayi !=tutulansayi && sayac !=3) {
                System.out.println("Yeniden Deneyin");
            }else {
                System.out.println("Bilemediniz Tutulan Sayi = "+tutulansayi);
            }
            sayac++;

        }while (sayac<=3);


    }
}
