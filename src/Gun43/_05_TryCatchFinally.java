package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime=0;
        String str="";
        try
        {
            startTime=System.currentTimeMillis();
            System.out.println("hatadan önceki kısım");
            char ilkharf=str.charAt(0);
            System.out.println("hatadan sonraki kısım");
            //hata olma olsasılığının olduğu kodlar
        }
        catch (Exception ex)
        {
            System.out.println("catch bloğu çalıştı");
            // hata olduğunda yapılacakalr
        }
        finally // hata olsa da çalışır olmasa da çalışır bu bölüm yılardaki süreçle ilgili olduğunu göstermek için finally içinde yazılır.
        {
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgii son yapılacakalar");

        }
        System.out.println("diğer çalışan kodlar");

        System.out.println("program sonu");
    }
}
