
public class BuilderTest3 {
    public static void main(String[] args) {
        Student3 student = new Student3.Builder("kim", 17) // 필수값
                .setHak(2).setBan(4) // 선택값
                .build();
        System.out.println("student = " + student);
    }
}

class Student3 {
    private String name;
    private int age;
    private int hak;
    private int ban;

    Student3(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.hak = builder.hak;
        this.ban = builder.ban;
    }

    static class Builder {
        // 필수 입력은 초기값x
        private String name;
        private int age;

        // 선택 입력은 초기값
        private int hak = 1;
        private int ban = 1;

        // 필수 값은 생성자로 받는다.
        Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Builder setHak(int hak) { this.hak = hak; return this;}
        public Builder setBan(int ban) { this.ban = ban; return this;}
        public Student3 build() { return new Student3(this); }
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age +
                ", hak=" + hak + ", ban=" + ban + '}';
    }
}