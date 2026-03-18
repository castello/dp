import java.util.HashMap;
import java.util.Map;

public class FlyweightTest {
    public static void main(String[] args) {
        BigCharFactory factory = BigCharFactory.getInstance();
        BigChar bigChar = factory.getBigChar('0');
        System.out.println(bigChar);
    }
}

class BigChar {
    private char charName;
    private String fontData;
    BigChar(char charName){
        this.charName = charName;
    }
    // ...
}

    class BigCharFactory {
        private Map<String, BigChar> pool = new HashMap<>(); // 0~9의 객체를 미리 만들어서 저장
        private static BigCharFactory singleton = new BigCharFactory();
        private BigCharFactory() {}
        public static BigCharFactory getInstance() { return singleton; }
        public BigChar getBigChar(char charname) {
            BigChar bc = pool.get(String.valueOf(charname)); // pool에서 꺼내서 반환
            if (bc == null) {
                bc = new BigChar(charname);
                pool.put(String.valueOf(charname), bc);
            }
            return bc;
        }
    }



