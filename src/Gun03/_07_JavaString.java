package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        String ad="İsmet"; // kelime veya kelimeleri saklamak için kullanılır.
                           // Sınırları " " ile belirlenir.
        String soyad="Temur";
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " +ad+"\t"+soyad);
        System.out.println("ad ve soyad = " +ad+" "+soyad);
         // + lar burada stringler arasında olduğu birleştirir
        String tamAd = "ismet" + " " + "Temur";
        System.out.println("tamAd = " + tamAd);

    }
}
