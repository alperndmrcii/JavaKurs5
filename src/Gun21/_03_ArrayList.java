package Gun21;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        ArrayList<Integer>notlar=new ArrayList<>();
        int toplam=0;
        String devamMi;
        do {
            //notu girecek
            System.out.print("Not = ");
            int not=okuInt.nextInt();
            //notları arrayliste at
            notlar.add(not);
            //Girilen notları topla
            toplam=toplam+not;
            //devam etmek istiyor musunuz ? E/H
            System.out.print("devam etmek istiyor musunuz ? E/H");
            devamMi=okuStr.next();
        }while (devamMi.equalsIgnoreCase("E"));

        //ortalamayı bul
        int ort=toplam/notlar.size();
        //geçen sayısını bul;
        int gecensayisi=0;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>ort)
                gecensayisi++;
        }
        System.out.println("geçen sayisi = "+gecensayisi);







    }
}
