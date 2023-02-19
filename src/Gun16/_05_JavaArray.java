package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // daha sonra random olarak bir tanesini seçip ekrana seçileni yazdıırnız.

        String[] tvler={"trt","atv","kanald","fox","haberturk"};
        int rastgele=(int) (Math.random()* tvler.length);
        System.out.println("Rastgele secilen tv"+tvler[rastgele]);
    }
}
