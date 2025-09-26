package control;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고
        // 눈의 합이 5이면 주사위 실행 멈추기
        while (true) {
            int dic1 = (int) (Math.random() * 6) + 1;
            int dic2 = (int) (Math.random() * 6) + 1;
            int sum = dic1 + dic2;
            // (1,3)
            System.out.printf("(%d , %d) 합계 %d\n", dic1, dic2, sum);
            // System.out.println(dic1 + " , " + dic2);
            if (sum == 5) {
                break;
            }
        }
    }
}
