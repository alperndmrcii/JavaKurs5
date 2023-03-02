package Gun27._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {


        int sayi=345;
        String StrSayi=String.valueOf(sayi);
        int IntSayi=Integer.parseInt(StrSayi);

        Utility ut=new Utility();
        String strSayi2= ut.getString(sayi);

        String strSayi3=Utility.getString2(sayi);




    }
}
