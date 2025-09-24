package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        // 자동 형변환 : float f = (float)i; => 작은타입을 큰타입으로 변환할 때는 자동으로 실행
        float f = i;
        int i2 = (int) f;

        double d = i; // 자동 형변환
        int i3 = (int) d;// 강제 형변환

    }
}
