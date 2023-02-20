package Gun17;

import java.util.Scanner;

public class _09_orneksoru2 {
    public static void main(String[] args) {

// Girilen bir email in uygun formatta olup olmadigini belirten bir program yaziniz.

/*Girilen email icin uygunluk kosullari

1- Email ".com" ile bitmeli
2- Email "@" işareti bulundurmali
3- "@" işareti ".com" dan once olmali
4- "@" işareti öncesinde en az 1 karakter olmali
5- "@" ile ".com" arasinda en az 1 karakter olmali*/

        Scanner oku = new Scanner(System.in);
        System.out.print("E mail adresi giriniz : ");
        String email = oku.nextLine();
        if (email.endsWith(".com")
          &&
            email.contains("@")
              &&
                email.indexOf("@")<email.indexOf(".com")
                  &&
                    !email.substring(0,email.indexOf("@")).isEmpty()
                      &&
                         !email.substring(email.indexOf("@")+1,email.length()-4).isEmpty()){
            System.out.println("Geçerli email adresi girdiniz");
        }else
            System.out.println("Geçersiz email adresi girdiniz ");

    }
}
