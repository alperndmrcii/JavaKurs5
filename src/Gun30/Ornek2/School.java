package Gun30.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1, "İsmet Temur");
        Student ogr2=new Student(1, "Sibel Akay");
        Student ogr3=new Student(1, "Alperen Demirci");
        // problem : hem id yi takip etmek zorundayım hem de hata olasılığı yüksek

        Student ogr10=new Student("İsmet Temur");
        Student ogr11=new Student("Mehmet Yılmaz");
        Student ogr12=new Student("Beyza Demir");
        System.out.println("ogr10 = "+ogr10);
        System.out.println("ogr11 = "+ogr11);
        System.out.println("ogr12 = "+ogr12);




    }
}
