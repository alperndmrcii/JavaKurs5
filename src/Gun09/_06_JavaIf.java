package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümlede A harfinin geçip gelçmediğini bulunuz geçiyor ise Evet geçmiyor ise Hayır yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cümle yazınız = ");
        String cumle= oku.nextLine();
        if (cumle.contains("a"))
        System.out.println("Evet");
        else
            System.out.println("Hayır");

        /* else yerine
        if (!cumle.contains("a"))
        System.out.println("Hayır"); da yapabilirdik
         */
        // 2.yol
        if (cumle.indexOf("a") !=-1)
            System.out.println("EVET");

        if (cumle.indexOf("a")==-1)
            System.out.println("Hayır");
        //3.yol
        boolean varMi=cumle.contains("a");
        if (varMi==true)
            System.out.println("Evet");

        if (varMi==false)
            System.out.println("Hayır");


























    }
}
