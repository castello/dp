
public class BuilderTest2 {
    public static void main(String[] args) {
        Student2 student = new Student2.Builder()
                .setName("kim").setAge(17).setHak(1).setBan(1)
                .build();
        System.out.println("student = " + student);
    }
}

class Student2 {
    private String name;
    private int age;
    private int hak;
    private int ban;

    static class Builder {
        private Student2 student;

        Builder() {
            this.student = new Student2();
        }

        public Builder setName(String name) { student.name = name; return this;}
        public Builder setAge(int age) { student.age = age; return this;}
        public Builder setHak(int hak) { student.hak = hak; return this;}
        public Builder setBan(int ban) { student.ban = ban; return this;}
        public Student2 build() { return student; }
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age +
                ", hak=" + hak + ", ban=" + ban + '}';
    }
}