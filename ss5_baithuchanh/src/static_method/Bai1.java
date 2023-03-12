package static_method;

public class Bai1 {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"lam");
        Student s2 = new Student(2,"minh");
        Student s3 = new Student(3,"hung");
        s1.display();
        s2.display();
        s3.display();
    }
}
