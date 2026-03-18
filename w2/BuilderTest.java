
public class BuilderTest {
    public static void main(String[] args) {
        // 단점 1: 매개변수가 많아지면, 순서가 바뀔 수 있다.
        Student s = new Student("kim", 1, 1, 1);
        System.out.println("s = " + s);
    }
}

class Student {
    private String name;
    private int age;
    private int hak;
    private int ban;

    // 단점 2: 생성자를 많이 만들어야 한다.
    Student() { this("Unknown", 17, 1, 1); }
    Student(String name) { this(name, 17, 1, 1); }
    Student(String name, int age) { this(name, age, 1, 1); }

    public Student(String name, int age, int hak, int ban) {
        this.name = name;
        this.age = age;
        this.hak = hak;
        this.ban = ban;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age +
                ", hak=" + hak + ", ban=" + ban + '}';
    }
}