package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";
        cumle=cumle.concat("bugün");
        cumle=cumle.concat("hava"); // + işareti stringlerde birleştrime yapar
        cumle=cumle.concat("çok soğuk");  // atama ister

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat(\"fakat dün sıcaktı\") = " + cumle.concat("fakat dün sıcaktı"));
        System.out.println("cumle = " + cumle); // cümle hala aynı değişmedi.

        cumle=cumle.concat("fakat dün sıcaktı"); // cümle şimdi değişti
        System.out.println("cumle = " + cumle); // gördüğümüz gibi değişti.

        /**************** String builder *****************/

        StringBuilder cumle2=new StringBuilder();
        cumle2.append("bugün"); // append ekle,atama istemez ekler. adamdır hızlıdır.
        cumle2.append("hava");
        cumle2.append("soğuk");
        System.out.println("cumle2 = " + cumle2);

        /******************** +, concat,Stringbuilder 3 modelin hızı test edilecek **************/
        long starttime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i <1000 ; i++) {
            test1=test1+"merhaba";
        }
        System.out.println(" + için geçen süre = " + (System.currentTimeMillis()-starttime));

        starttime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i <1000 ; i++) {
            test2=test2.concat("merhaba");
        }
        System.out.println("concat için geçen süre = " + (System.currentTimeMillis()-starttime));



        starttime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i <1000 ; i++) {
            test3.append("merhaba");
        }
        System.out.println(" String builder için geçen süre = " + (System.currentTimeMillis()-starttime));
        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("*****************************\n\n");

        /********************StringBuilder'ı biraz yakından tanıyalım***********************/
        StringBuilder sb=new StringBuilder();
        sb.append("Bugün "); // kendine ekleme atama gerektirmez(concatte gerekirdi)
        sb.append("hava ");
        sb.append("güzel ");

        System.out.println("sb = " + sb);
        System.out.println("sb lenght = " + sb.length());

        sb.append(4); // eklenen her şeyi toString hali varsa çevirerek ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // Stringi tersine çevirir.
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); // 0 dahil 5 hariç olmak üzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen indexdeki karakteri siler.
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime"); // 0 nolu indexe kelimeyi ekle : araya ekleme
        System.out.println("sb = " + sb);

        sb=new StringBuilder("Bugün hava çok soğuk"); // Sıfırlandı ve ilk değer atandı
        System.out.println("sb = " + sb);

        sb.replace(3,8,"Bu"); // verilen aralığı bu string ile değiştirdi
        System.out.println("sb = " + sb);

        String strSb=sb.toString();

        StringBuffer sBuffer=new StringBuffer();// tamamn StringBuilder ile aynı
        // tek farkı paralel çalışan yazılımlarda StringBuffer kullanılır.
    }
}
