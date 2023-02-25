package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matnotlari = new ArrayList<>();
        ArrayList<Integer> fiziknotlari = new ArrayList<>();
        ArrayList<Integer> kimyanotlari = new ArrayList<>();

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiziknotlari.add(30);
        fiziknotlari.add(40);

        kimyanotlari.add(70);
        kimyanotlari.add(80);
        kimyanotlari.add(90);
        kimyanotlari.add(100);

        // Arraylist'in arraylistini nsaıl yaparım ???
        ArrayList<ArrayList<Integer>> notlarlistesi = new ArrayList<>(); //Listlerin listesi
        notlarlistesi.add(matnotlari);
        notlarlistesi.add(fiziknotlari);
        notlarlistesi.add(kimyanotlari);
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarlistesi.size(); i++) { // her bir derslerin tüm notları

            System.out.print(dersler.get(i) + " : ");

            for (int j = 0; j < notlarlistesi.get(i).size(); j++) { // tek tek notlar

                System.out.print(notlarlistesi.get(i).get(j) + "\t");

            }
            System.out.println();
        }
        // kullanıcıdan istediği bir dersin nosunu alarak (0-mat,1-fizik 2-kimya)
        // sadece istediği derslere ait notları bir metodda yazdırınız.

        System.out.println("************************");
        Scanner oku = new Scanner(System.in);
        System.out.print("0-mat,1-fizik 2-kimya = ");
        int dersNo = oku.nextInt();
        dersNotlariniYazdir(notlarlistesi,dersNo);

        // YUKARIDA VERİLEN DERSE AİT NOT ORTALAMASINI VE GEÇEN SAYISINI BİR METODDA YAZDIRINIZ.

    }
    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer> >notlarListesi, int dersNo){
        for (int i = 0; i <notlarListesi.get(dersNo).size() ; i++) {
            System.out.print(notlarListesi.get(dersNo).get(i)+"\t");
        }
    }
}
