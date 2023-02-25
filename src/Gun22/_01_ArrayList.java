package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);
        sayilar.add(99);
        sayilar.add(101);

        System.out.println("Sayilar = "+sayilar);
        // Sıralama işlemi.
        Collections.sort(sayilar);
        System.out.println("Sort Sayilar = "+sayilar);
        // Tersine çevir
        Collections.reverse(sayilar);
        System.out.println("Reverse sayilar = "+sayilar);
        // Max ve min eleman bulma
        System.out.println("Collections.max = "+Collections.max(sayilar));
        System.out.println("Collections.min = "+Collections.min(sayilar));
        // Bütün elemanları set etme
        Collections.fill(sayilar,0);
        System.out.println("Fill sayilar = "+sayilar);
        //Replaceall
        Collections.replaceAll(sayilar,0,5);
        System.out.println("Replace Sayilar = "+sayilar);
        // Tanımlarken değer atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer>liste=new ArrayList<>( Arrays.asList(3,4,5) );
        ArrayList<String>strList=new ArrayList<>(Arrays.asList("ahmet","mehmet","büşra","roman"));
        // Diziyi direkt Arrayliste nasıl atarım
        Integer[]dizi2={2,3,4,5};
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(dizi2));
    }
}
