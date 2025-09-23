package basic;

public class Variable3 {

    public static void main(String[] args) {
        // 실수형: float, double(기본타입)
        // float: f, F
        // double이 기본형이라서 실수가 나오고 지정하지 않는다면 double로 인식한다
        float score1 = 50.15f;
        double score2 = 45.125d;
        // double: d, D
        System.out.println("score1 = " + score1); // 50.0C
        System.out.println("score2 = " + score2);
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2);
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2);
    }
}
