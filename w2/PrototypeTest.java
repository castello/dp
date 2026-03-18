

public class PrototypeTest {
    public static void main(String[] args) {
        Car car  = Car.getInstance();
        Car car2 = Car.getInstance();
        System.out.println("car = " + car);
        System.out.println("car2 = " + car2);
    }
}

class Engine{}
class Door{}
class Car implements Cloneable {
    private static Car instance = new Car();
    private Engine e;
    private Door d;
    Car() {
        this.e = new Engine();
        this.d = new Door();
    }

    static Car getInstance() {
        Car car = null;
        try {
            car = (Car)instance.clone(); // 기존의 객체를 복제
        } catch(Exception e) {
            car = new Car(); // 객체를 새로 생성
        }
        return car;
    }
}


