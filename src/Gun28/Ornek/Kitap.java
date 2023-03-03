package Gun28.Ornek;

public class Kitap {
 String name;
 String author;
 int publishYear;


 public Kitap()
 {

 }
 public Kitap(String name,int publishYear,String author)
 {
     this.name=name;
     this.publishYear=publishYear;
     this.author=author;
 }
 public Kitap(String name) {
     this(name, 0, "");
 }


 public String toString()
     {
         return name+" "+author+" "+publishYear;
     }
}
