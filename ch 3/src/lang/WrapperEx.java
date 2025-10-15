package lang;

// 래퍼 클래스
// 기본타입 변수를 객체로 다루고자 할 때 사용
public class WrapperEx {
    public static void main(String[] args) {
        // boolean => Boolean
        boolean b = true;
        // Boolean boolean1 = new Boolean(b); <= 더 이상 지원 안함
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false; // Boolean.valueOf(b); 자동으로 이렇게 변환해준다

        // byte => Byte
        Byte byte1 = 1;
        // 1 => int 형으로 인식
        Byte byte2 = Byte.valueOf((byte) 1);

        // char => Character
        Character ch = 'a';

        // short => Short
        // int => Integer
        Integer.parseInt("15");
        // long => Long
        Long long1 = 15L;
        // folat => Float
        // double => Double
    }
}
