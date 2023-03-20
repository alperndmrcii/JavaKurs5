package Gun38._01_Abstract;

public class otoMain {
    public static void main(String[] args) {
        // referans tipi // nesne tipi
        Ford fr = new Ford("mustang", 1995, 4);
        // Ford normal class ve nesne oluşturulabilir yani new yapılabilir.

        // IBinekOto ib=new IBinekOto(); interfacelerden nesne oluşturulmaz
        // sadece referans tip olabilirler.
        BinekOto bo=new Ford("mustang",1995,4);

       // BinekOto bo1=new BinekOto("mustang",1975,4); abstract classlardan nesne olusturulmaz sadece referans.
       // Somut Class               Soyut(abstract) Class             Interface
       // tamamı dolu               kısmi dolu                       metodlar bos
       // def const var             const olabilir                   const olamaz
       // new yapılabilir           new olamaz                       new olamaz
       // access modify var         access modify var                public-def
       // tamamen somut             kısmi somut                      tamamen soyut

    }
}
