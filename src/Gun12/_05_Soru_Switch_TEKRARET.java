package Gun12;

import java.util.Scanner;

public class _05_Soru_Switch_TEKRARET {
    public static void main(String[] args) {
        // Daha önce çözdüğünüz hesap makinesi sorusunu switch ile çözünüz
        //Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayi = ");
        int s1= oku.nextInt();
        System.out.print("2.sayi = ");
        int s2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Cıkarma için C");
        System.out.println("Carpma  için P");
        System.out.println("Bölme  için B");
        System.out.print("Seçiminiz = ");
        Scanner okuStr=new Scanner(System.in);
        String secim=okuStr.next();
        switch (secim.toLowerCase())
        {
            case "t": System.out.println("toplam" + (s1+s2));break;
            case "c": System.out.println("farkı"+ (s1-s2));break;
            case "p": System.out.println("çarpım"+(s1*s2));break;
            case "b": System.out.println("bölüm"+(s1/s2));break;
            default: System.out.println("Hatalı Değer");
        }




    }


        }