package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {
        // Concat : Bir String diğerine birleştiriyor

        String s1="Merhaba";
        String s2="Dünya";
        System.out.println("Birleşik hali = "+ s1+s2);
        System.out.println("birleşik hali= "+s1.concat(s2)); // birleşmiş hali // araya boşluk konulmamış hali
        System.out.println("birleşik hali= "+s1.concat(" "+s2)); // araya boşluk konulmuş hali
        System.out.println("birleşik hali= "+s1.concat(" " +"Venüs"));

    }
}
