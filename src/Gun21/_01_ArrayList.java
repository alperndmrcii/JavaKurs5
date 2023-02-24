package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

       // dizi array : boyut sayısı belli sonradan değiştirilemez.
        int[] dizi = new int[5];

        // Boyutu dinamik olsun, eleman ekledikçe uzasın,sildikçe kısaldın
        // Arraylist : Boyutunu başta vermene bile gerek yok, boyutu başlangıçta 0 eleman ekledikççe artar sildikçe kısalir
        ArrayList<Integer> intergerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("ahmet");
        isimler.add("süleyman");
        isimler.add("hıdır");
        isimler.add("hamza");
        System.out.println("isimler = "+isimler);
        System.out.println("isimler.size"+isimler.size());

        isimler.add(0,"Mıho"); // rakam verirsek rakamdan sonra gelen isimleri(bu senaryoda "mıho" 0.sıraya yazar)
        System.out.println("isimler= "+isimler);
        System.out.println("isimler.size()"+isimler.size());

        isimler.set(1,"Zafer"); // verilen indextek elemanı değiştirir
        System.out.println("isimler= "+isimler);

        isimler.remove("Zafer"); // değere göre siler
        System.out.println("isimler = "+isimler);

        int indexOfhamza=isimler.indexOf("hamza");
        System.out.println("indexofhamza = "+indexOfhamza);

        String ilkEleman=isimler.get(0); // verilen indexteki elemanı verir
        System.out.println("ilkeleman= "+ilkEleman);

        isimler.clear(); // her şeyi temizliyor
        System.out.println("isimler = "+isimler);
    }
}
