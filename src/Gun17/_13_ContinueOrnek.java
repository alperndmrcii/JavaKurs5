package Gun17;

public class _13_ContinueOrnek {
    public static void main(String[] args) {
        //4 hariç hepsini yazar

        for (int i = 0; i <100 ; i++) {
            if (i==4){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("işleme devam eder");
    }
}
