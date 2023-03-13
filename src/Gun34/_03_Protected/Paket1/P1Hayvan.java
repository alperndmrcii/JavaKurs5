package Gun34._03_Protected.Paket1;

public class P1Hayvan {
    public String ad; // her paketten her yerden erişiliyor
    int yas; // sadece bulunduğu pakettekiler
    protected String cinsi; // default gibi ancak diğer paketlerden erişimle ilgili bir seçeneği var
    // extends yapılırsa erişilebiliyor.
    private String renk; // sadece bulunduğu classdan erişiliyor.
}
