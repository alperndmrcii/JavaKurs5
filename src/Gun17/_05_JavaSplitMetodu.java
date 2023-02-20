package Gun17;

import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split : bir stringi parçalara ayırmak demek
        // kullanıcından alacağınız bir cumleyı kelimelere gore alt alta yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.println("cümle = ");
        String cumle= oku.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i <cumle.length(); i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }




    }
}
