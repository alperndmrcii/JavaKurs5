package Gun38._03_Abstract_Soru;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(5,4);
        d.setName("Yeni Dikdörtgen");
        d.ciz();
        System.out.println("d = "+ d);

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println("dr= " + dr);
    }
}
