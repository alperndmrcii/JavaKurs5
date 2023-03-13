package Gun34._02_Okul_Ornek_Extends;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("ismet temur",ogrTip.LISE,"Sayısal");
        LiseOgrencisi lo2=new LiseOgrencisi("mehmet yılmaz",ogrTip.LISE,"Sözel");
        IlkOgrencisi ilk=new IlkOgrencisi("ayşe bayrak",ogrTip.ILK,"Satranç");
        System.out.println("lo1 = "+lo1);
        System.out.println("lo2 = "+lo2);
        System.out.println("ilk = "+ilk);

    }
}
