package Gun30.Ornek2;

public class Student {
    int id;
    String fullName;

    static int sayac=1; // sen bitanesin <3
    // static olmadan her zman 0 ile başlıyordu
    // static olduğunda artık bir tane olduğundan
    // değerini korudu ve hep 1 tane artırdı.

    public Student(String fullName) {
        this.id = sayac++;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
    public  Student(int id, String fullName) {
        this.id = id++;
        this.fullName = fullName;
    }
}
