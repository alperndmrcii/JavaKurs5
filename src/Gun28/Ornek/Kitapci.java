package Gun28.Ornek;

public class Kitapci {

    // Book Class yazınız. Fields : name,publishYear,author
    // 3 adett Constructor ekleyiniz.
    // kitapların özellliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructorla oluşturup maine yazdırınız

    public static void main(String[] args) {

    Kitap kit1=new Kitap();
    kit1.name="Harry Potter";
    kit1.author="JK Rowling";
    kit1.publishYear=1997;

    Kitap kit2=new Kitap("Yüzüklerin Efendisi",1954,"JRR Tolkien");

    Kitap kit3=new Kitap("Üzüm ve Çay");

    }
}
