package object;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        // 메소드 호출
        // 1) 변수에 받기
        // 2) 출력문
        long result = myMath.add(12, 63);
        System.out.println("덧셈결과 : " + result);

        result = myMath.subtract(85, 35);
        System.out.println("뺄셈 결과 : " + result);

        result = myMath.multiply(34, 36);
        System.out.println("곱셈 결과 : " + result);

        double result1 = myMath.divide(12, 58);
        System.out.println("나눗셈 결과 : " + result1);
    }
}
