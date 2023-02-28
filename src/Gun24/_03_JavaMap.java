package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız.

        HashMap<String,String>ukartvizit=new HashMap<>();
        ukartvizit.put("isim","Uğur Yılmaz");
        ukartvizit.put("email","ugur@gmail.com");
        ukartvizit.put("adres","Çekmeköy/İstanbul");
        ukartvizit.put("telefon","05056667770");

        System.out.println("ukartvizit.get(\"isim\") = " + ukartvizit.get("isim"));
        System.out.println("ukartvizit.get(\"telefon\") = " + ukartvizit.get("telefon"));

        HashMap<String,String>akartvizit=new HashMap<>();
        akartvizit.put("isim","Ayşe Bayrak");
        akartvizit.put("email","ayse@gmail.com");
        akartvizit.put("adres","Şişli/İstanbul");
        akartvizit.put("telefon","053255566657");

        HashMap<String,HashMap<String,String > > kartvizitler=new HashMap<>();

        kartvizitler.put("ugur",ukartvizit);
        kartvizitler.put("ayse",akartvizit);

        System.out.println("kartvizitler.get(ugur) = " + kartvizitler.get("ugur"));
        System.out.println("kartvizitler.get(ayse) = " + kartvizitler.get("ayse"));

        System.out.println("Ayşe'nin Adresi = " + kartvizitler.get("ayse").get("adres"));

        for (Map.Entry<String,HashMap<String,String>>kv:kartvizitler.entrySet()){
            System.out.println("kv.getValue().get(\"email\") = " + kv.getValue().get("email"));
        }
    }
}
