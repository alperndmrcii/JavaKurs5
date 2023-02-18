package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        for (int j = 1; j <=5; j++) { // Kaç satır olacağını belirtiyor.
            for (int i = 5; i >= j; i--) // her bir satırdaki sınır 5
                System.out.print("*");
            System.out.println();
        }
        // TERSTEN YAPILIŞI DA BU
        for (int j = 1; j <=5; j++) { // bu da satırı belirtiyor
            for (int i = 0; i < j; i++) // her bir satırdaki sınır 5
                System.out.print("*");
            System.out.println();
        }
    }
}
