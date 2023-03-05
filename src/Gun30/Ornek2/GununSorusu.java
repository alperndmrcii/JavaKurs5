package Gun30.Ornek2;

public class GununSorusu {

    int a;
    static int b=0; // sen bitanesin <3

    void artir()
    {
        a++;
        b++;
    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;

        GununSorusu gs2=new GununSorusu();
        gs2.a=7;


        // anın değeri kaç oldU ???? :: Burada sorulacak soru aslında hangi a yı sordumuz olmalıydı
        // burada her nesnenın a sı var ve gs1 ın 5 gs2 nın 7 değeri var
        System.out.println("gs1.a= "+gs1.a);
        System.out.println("gs2.a= "+gs2.a);

        // soru b nin değeri kaçtır : tek bir değeri vardır çünkü static
        System.out.println("gununSorusu.b = "+GununSorusu.b);
        gs1.artir();// gs1.a -> 6, b=1
        gs2.artir();// gs2.a -> 8, b=2
        System.out.println("gs1.a"+gs1.a);
        System.out.println("gs2.a"+gs2.a);
        System.out.println("soru.b"+GununSorusu.b);

    }

}
