package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
// Aşağıdaki görüntüyü veren programı yazınız
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *
        for (int satir = 1; satir <= 5; satir++) { // kaç satır istediğimi yazdım
            for (int i = 1; i <= satir; i++)
                System.out.print("*");
            System.out.println();}
        for (int j = 1; j <=5; j++) { // Kaç satır olacağını belirtiyor.
            for (int i = 5; i >= j; i--) // her bir satırdaki sınır 5
                System.out.print("*");
            System.out.println();}



        }


    }



