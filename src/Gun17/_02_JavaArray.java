package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
// kullanıcıının gırecegı bır cumlede kac kelıme oldugunu bulunuz for ile yapjnız

        Scanner oku=new Scanner(System.in);
        System.out.println("cümle= ");
        String cumle= oku.nextLine();
        int boslukSayisi=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)==' ')
                boslukSayisi++;
        }
        System.out.println("boslukSayisi = " +( boslukSayisi+1));
    }
}
