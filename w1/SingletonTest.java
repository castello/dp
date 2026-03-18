public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
    }
}

class Singleton {
    static Singleton s = new Singleton();
    private Singleton() {}

    static Singleton getInstance() {
        if(s==null)
            return new Singleton();
        return s;
    }
}
