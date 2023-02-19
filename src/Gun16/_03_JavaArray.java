package Gun16;

public class _03_JavaArray {
    public static void main(String[] args) {
        int[] dizi=new int[5]; // 0,1,2,3,4, indexli 5 elemanlı dizi
        int[] dizi2={5,6,34,77,66}; // 5 elemanlı bir dizi hem tanımladım hem de ilke değerlerini verdim.
        String[] kelime=new String[5]; // 5 tane keime / cumle saklayabilen bir dizzi değişkeni
        boolean[] dizi3=new boolean[5];// 5 tane boolean true/false saklayabilen dizi değişkeni
        double[] oranlar=new double[5];// 5 tane double saklayabilen bir dizi değişkeni

        for (int i = 0; i <dizi.length ; i++) {
            System.out.println("dizi = "+dizi[i]);
        }
        for (int i = 0; i <dizi2.length; i++) {
            System.out.println("dizi2 =" +dizi2[i]);
        }
        for (int i = 0; i <dizi3.length ; i++) {
            System.out.println("dizi3 = "+dizi3[i]);
        }
        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar = "+oranlar[i]);
        }
        for (int i = 0; i < kelime.length ; i++) {
            System.out.println("kelime= "+ kelime[i]);
        }
    }
}
