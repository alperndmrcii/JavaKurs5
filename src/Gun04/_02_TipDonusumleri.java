package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;
        int toplam=ogrNot1+ogrNot2+ogrNot3+ogrNot4; // byte ---> int atınca problem çıkarmadı (GENİŞLETME ---> WIDENING CASTING)
        //çünkü byte için hafızada ayrılan, zaten int e sığar, sığdığı için kabul eder.
        //çünkü veri kaybı olma ihtimali hiç yok.
        ogrNot1 = (byte)toplam; // int ---> byte atınca dur bakalım dedi (DARALTMA ---> NARROWING CASTING)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış bi alana atma işlemi var.
        // büyük bir alan küçük bir alana sorunsuz gidemeyeceği için veri kaybı ihtimali var.
        System.out.println("toplam = " + toplam);


    }
}
