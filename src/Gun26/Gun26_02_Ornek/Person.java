package Gun26.Gun26_02_Ornek;

import java.util.Locale;

public class Person {
    String name;
    String surname;
    int age;


    public void BilgiYazdir()
    {
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }


    public String toString() {
        return name+" "+surname+" "+age;

    }
    public void getBirthDay(){
        System.out.println("doğum yılınız = "+(2022-age));
    }
    public void getInitials(){

        System.out.println("Initials = "+name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0));


    }
}