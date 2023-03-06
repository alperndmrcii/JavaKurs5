package Gun31._01_Enum;

public class Ornek1Cozum {


        enum Aylar {
            Tanimsiz, OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
           // Yazılım dillerinde enum, enumaration ve enum sabitleri olarak adladırılmaktadır. Tanımlanan değişkenlerin
           // sabit değer alması için kullanılır. Tanımlanan bu sabit değerler bir grup oluşturur. Erişilmesi, yönetilmesi ve anlaşılması kolay hale gelir.
        }
    public static void main(String[] args) {
        Aylar ay=Aylar.OCAK;
        switch (ay)
        {
            case SUBAT: System.out.println(28);break;
            case OCAK: System.out.println(30);break;
            case MART: System.out.println(30);break;
            case NISAN: System.out.println(30);break;
            case MAYIS: System.out.println(30);break;
            case HAZIRAN: System.out.println(30);break;
            case TEMMUZ: System.out.println(30);break;
            case AGUSTOS: System.out.println(30);break;
            case EYLUL: System.out.println(30);break;
            case EKIM: System.out.println(30);break;
            case KASIM: System.out.println(30);break;
            case ARALIK: System.out.println(30);break;
        }
        if (ay==Aylar.MAYIS)
        {
            System.out.println("zam yapıldı");
        }
        System.out.println("ay = "+ay); // toString
        System.out.println("ay.name() ="+ay.name()); // SIMGE olarak kullanılan kelimeyi veriyor
        System.out.println("ay.ordinal() = "+ay.ordinal()); // SIMGE'nın indexini veriyor

        for (Aylar a: Aylar.values())
            System.out.println(a.name()+" - "+a.ordinal());



    }
}




