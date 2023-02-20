package Gun17;

public class _14_WhileLoopOrnegi {
    public static void main(String[] args) {


        int sayi=0;
        int sayac=0;
        while (sayac<10){
            if (sayi<10){
                System.out.println("Bildiniz");
                sayac++;
            }
            System.out.println("while dongusu cagrıldı...");
        }
        sayac++;
       // do while loop neden 10 defa cagrılmadı ?
        int y=0;
        do {
            System.out.println("do-while döngüsü cagrıldı");

        }while (y<10);

    }


}
