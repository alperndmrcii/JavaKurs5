package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {
        int sayi=5; // tek bir rakam tutabilen değişken
        int[]dizi=new int[20]; // 20 adet sayi saklayabilen bir değişken uzunluğu sabit.
        int[][] tablo=new int[20][2]; // 20x2lik sayı saklayabilen değşiken sabit uzunluklu
        ArrayList<Integer>liste=new ArrayList<>();// istenildiği kadar sayı saklayabilen uzunluğu değişken.
        // Bir sınıf bu sınıfda 20kişi var ve bunların 3 dersi olsun öğrencilerin bu 3 derse ait notlarını nasıl bir değişkende saklayabilirim ?
        ArrayList<Integer>matnotlari=new ArrayList<>();
        ArrayList<Integer>fiziknotlari=new ArrayList<>();
        ArrayList<Integer>kimyanotlari=new ArrayList<>();

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiziknotlari.add(30);
        fiziknotlari.add(40);

        kimyanotlari.add(60);
        kimyanotlari.add(70);
        kimyanotlari.add(80);
        kimyanotlari.add(90);

        // Arraylist'in arraylistini nsaıl yaparım ???
        ArrayList<ArrayList<Integer> >notlarlistesi=new ArrayList<>(); //Listlerin listesi
        notlarlistesi.add(matnotlari);
        notlarlistesi.add(fiziknotlari);
        notlarlistesi.add(kimyanotlari);

        notlarlistesi.get(0); // ---> matnotlari
        int matbirnot=notlarlistesi.get(0).get(0); //mat notlarının ilkini aldım
        // Yukarıdakinin yerine for döngüsü nasıl kullanırız ????
        for (int i = 0; i <notlarlistesi.size() ; i++) { // 0 olacak sonra 1 olacak sonra 2 olacak
            System.out.println("notlarlistesi.get("+i+") = "+notlarlistesi.get(i));
        }
        ///////////// satir sütun yazdırma
        for (int i = 0; i <notlarlistesi.size() ; i++) {
            for (int j = 0; j <notlarlistesi.get(i).size() ; j++) { // notlar.lenght
                System.out.println(notlarlistesi.get(i).get(j)+"\t"); // notlar[i][j]
            }
            System.out.println();
        }

    }
}
