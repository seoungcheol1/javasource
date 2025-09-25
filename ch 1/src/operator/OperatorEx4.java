package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        // 논리연산자 : &&(and) || (or) !(not)

        // x > 10 && x < 20 x는 10보다 크고 20보다 작다
        // i % 2 == 0 || i % 3 == 0 i는 2의 배수 또는 3의 배수이다
        int x = 15;
        System.out.println(x > 10 && x < 20);

        // (i % 2 == 0 || i % 3 == 0) && i % 6 !=0
        // i는 2의 배수 또는 3의 배수지만 6의 배수는 아니다
        // or와 and가 같이 쓰이면 and의 우선순위가 더 높다
        int i = 6;
        System.out.println((i % 2 == 0 || i % 3 == 0) && i % 6 = 0);

        // 문자 ch는 대문자 또는 소문자이다
        // 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'
        char ch = 'A';
        System.out.println('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z');

        boolean result = 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z';
        // !true => false / !false => true
        System.out.println(!result);// false

    }
}
