package Gun33._03_Inheritance_Ornek;

public class Mainolanyer {
  //  Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
  //  consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
  //  GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
  //  GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
  //  SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
  //  maaşları hesaplatıp, bordroyu yazdırınız.
  public static void main(String[] args) {

    Calisan calisan1=new Calisan("alperen",9000,1.4);
      System.out.println(calisan1);
      Mudur mudur1=new Mudur("ismet",15000,1.4,2000);
      System.out.println(mudur1);

  }
}
