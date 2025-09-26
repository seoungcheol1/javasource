package control;

public class ExamEx6 {
    public static void main(String[] args) {
        // 중첩 for 방정식 4x + 5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력
        // x,y 는 10이하의 자연수
        int x, y;
        for (x = 1; x <= 10; x++) {

            for (y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.printf("(%d , %d)\n", x, y);

                }
            }
        }
    }
}
