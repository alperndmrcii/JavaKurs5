package Gun32._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
        // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
        // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

        Araba araba1=new Araba();
        araba1.setModel(1965);
        araba1.setRenk("kırmızı");
        araba1.setKapiSayisi(4);
        araba1.setMotorHacmi(1.6);

        System.out.println(araba1.getKapiSayisi());
        System.out.println(araba1.getModel());
        System.out.println(araba1.getRenk());
        System.out.println(araba1.getMotorHacmi());
        System.out.println(araba1);



    }
}
