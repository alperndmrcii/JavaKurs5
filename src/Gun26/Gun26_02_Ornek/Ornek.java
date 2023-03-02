package Gun26.Gun26_02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : çallıştığında kişinin doğum yılını versin
        // 5- Adım : getInıtıals ısmınde kısının adının ve soyadının ılk harfı seklınde
        // (Buyuk Harf) veren metodu yazınız
        
        Person cal1=new Person();
        cal1.name="Hatice";
        cal1.surname="Demir";
        cal1.age=30;
        
        Person cal2=new Person();
        cal2.name="Muhammed";
        cal2.surname="Gürdal";
        cal2.age=35;
        
        // Ya 100 çalışan olsaydı hepsini nasıl yazdıracaktık ???
        // Methodda yazdıracağız.

        cal1.BilgiYazdir();
        cal2.BilgiYazdir();


    // 2.Yöntem
        // Person Classının içine bir metod açıyoruz public string toString diye
        // böylelikle sout yaptığımızda gizli bir cal1.ToString gibi bir kod çalışıyor
        // ve bizim tek bir kodla cal1'i yazdırmamıza olanak sağlıyor.
        System.out.println("cal1 = " + cal1);
        cal1.getBirthDay();
        cal1.getInitials();



    }
}
