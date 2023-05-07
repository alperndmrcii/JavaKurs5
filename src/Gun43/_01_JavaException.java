package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {
        System.out.println("program calışmaya başladı");
        String kelime=""; // önce ; koymadık bu compile error
        char harf=kelime.charAt(3); // bu satırı en son eklkedik bu runtime error
        System.out.println("program bitti");
    }
}
/************ daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara derleme zamanı yani compile error Exception diyoruz ****************/

/************  program çalıştırktan sonra calısma zamanı ıcerınsındekı hatalara calısma zamanı yanı runtıme error exception diyoruz ***************/