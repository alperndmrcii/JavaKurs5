package Gun31._02_Enum;

public class Soru {
    enum Role { ADMIN, MUDUR, SATIS, PERSONEL }
    enum Status{ AKTIF,PASIF }

    public static void main(String[] args) {
// Bir User yetkilendirme modülü yapılması isteniyor.
        // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
        // USER STATUSU : AKTIF, PASIF
        // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
        // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
        // kullanıcısı tanımlayınız.
        // UserSilme isimli fonksiyona bu userları gönderiniz.
        // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

        USER user1=new USER("ismet",Role.ADMIN,Status.AKTIF);
        USER user2=new USER("mehmet",Role.MUDUR,Status.PASIF);
        USER user3=new USER("alperen",Role.SATIS,Status.AKTIF);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        userSil(user1);
        userSil(user2);
        userSil(user3);
        

    }

    public static void userSil(USER user)
    {
        if (user.role==Role.ADMIN)
        {
            System.out.println(user.username+ "Admin Silinemez");
        }
    }
}