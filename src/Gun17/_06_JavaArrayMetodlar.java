package Gun17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] isimler={"ahmet","zeynep","roman","yasin","cihan"};

        // Diziyi String olarak direkt yazdırır.

        System.out.println("isimler = " + Arrays.toString(isimler));

        //Dizi sıralama

        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        //Diziler eşit mi ?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // True
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // False

        Arrays.sort(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));;

        //Contains gibi çalışır var ise pozitif bir değer döndürür yok ise negatif

        System.out.println("Arrays.binarySearch() ="+Arrays.binarySearch(b,3));
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch() = " + Arrays.binarySearch(b,3));




    }
}
