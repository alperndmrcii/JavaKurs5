package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının pozitif negatif veya sıfır olduğunu yazdırnız

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= oku.nextInt();
        if (sayi>0)
        {  System.out.println("pozitif");
        }
        else
        {
            if (sayi<0)
                System.out.println("negatif");
            else
                System.out.println("sıfır");
        }




    }
}
