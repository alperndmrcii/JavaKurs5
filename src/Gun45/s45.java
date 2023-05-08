package Gun45;

public class s45 {
    public static void main(String[] args) {
        String names[] = {"thomas", "peter", "joseph"};
        String pwd[] = new String[3];

        int idx = 0;
        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                idx++;
            }
        } catch (Exception e) {
            System.out.println("invalid name");
        }
        for (String p : pwd)
            System.out.println(p);
    }
}