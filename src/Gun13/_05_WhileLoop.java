package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {

        // 100 e kadar olan sayıların toplamını bulunuz
        // sayi girişi sayo okuma var mı ? yok.

        int sayac=1;
        int toplam=0;
        while (sayac<=100)
            {
                toplam=toplam+sayac;
                sayac++;
            }
        System.out.println("toplam = "+toplam);
    }
}
