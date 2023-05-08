package Gun45;

public class s13 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+ " ");

            if (arr[i].equals("D")){
                System.out.println("work done");
                break;
            }
        }
    }
}
