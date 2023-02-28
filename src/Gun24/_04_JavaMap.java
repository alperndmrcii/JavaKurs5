package Gun24;

import java.util.*;

public class _04_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(9,"tilki");
        hm.put(2,"kedi");
        hm.put(30,"köpek");
        hm.put(11,"kuş");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm);// hızlı çalışmak için kendisine göre sıralama yapar

        LinkedHashMap<Integer,String > lhm=new LinkedHashMap<>();
        lhm.put(9,"tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"köpek");
        lhm.put(11,"kuş");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm);//Eklendiği sıraya göre sıralı

        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(9,"tilki");
        tm.put(2,"kedi");
        tm.put(30,"köpek");
        tm.put(11,"kuş");
        tm.put(4,"kurt");
        System.out.println("tm = " + tm); // Her zman sıralı KEY'e göre kendinden sortlu







    }
}
