package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("merhabaha dunya");
        System.out.println("merhabaha dunya");

        merhabaYaz(); // Giden yok , dönen yok
        toplamYaz(4,5); // giden var dönen yok ( fonksiyonu bir şeye eşitleyebilir misin)
        int enb=Math.max(4,5); // giden var , dönen var ( fonsiyonu bir şeye eşitleyebilir misin)
        double sayi=Math.random();//gideni yok döneni var

        enbYaz(4,5);
        enb=enbBul(4,5);
        System.out.println("enb= "+enb);
        slmYaz();
    }
    public static int enbBul(int a,int b){ // DÖNECEK TİP
        int donecek=0;
        if (a>b)
            donecek=a;
        else donecek=b;

        return donecek; // Dönecek değer

    }
    public static void  enbYaz(int a,int b){
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
    public static void toplamYaz(int a,int b){
        System.out.println(a+b);
    }
    public static void merhabaYaz(){
        System.out.println("merhaba dünya");


    }
    public static void slmYaz(){
        System.out.println("slm");
    }
}
