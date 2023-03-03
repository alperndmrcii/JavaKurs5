package Gun28.Ornek1;

public class Bankalar {

        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.
        public static void main(String[] args) {


        Banka bank1=new Banka("Ziraat",10,1920);
        Banka bank2=new Banka("Garanti",20,1900);
        Banka bank3=new Banka("Finans",30,1881);

            System.out.println("bank1 = " + bank1);
            System.out.println("bank2 = " + bank2);
            System.out.println("bank3 = " + bank3);

    }
}
