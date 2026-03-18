public class FactoryMethodTest {
    public static void main(String[] args) {
        Product p = new Product(); // 생성자
        Product p2 = Factory.getInstance(); // factory method
    }
}

class Product {}
class Factory {
    static Product p = new Product();
    static Product getInstance() {
        return p; // 미리 생성한 객체를 반환
    }
}



