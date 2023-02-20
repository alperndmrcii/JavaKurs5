package Gun17;

public class _12_Breakornek {
    public static void main(String[] args) {

        // sayac 4 e gelince durur geri kalanı yazmaz
        for (int i = 0; i <10 ; i++) {
            if (i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("işleme devam eder");
    }
}
