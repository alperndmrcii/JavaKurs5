package Gun45;

public class s56_2 {
    public static void main(String[] args) {
        String names[] = {"thomas", "peter", "joseph"};
        String pwd[] = new String[3];
        int idx = 0;
        for (String n : names)
            try {

                {
                    pwd[idx] = n.substring(2, 6); // 2 dahil 6 hariç
                    System.out.println(pwd[idx]); // omas
                    idx++;
                }
            } catch (Exception e) {
                System.out.println("Invalid Name");
            }
    }
}