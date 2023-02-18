package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // 2lerin çarpım tablosunu sormuştuk 2x1 =1 2x2 =4
        // 5 lere kadar halini yapınız.

        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + "x" + i + "= " + (j * i));
            }
            System.out.println();
        }
    }
}
