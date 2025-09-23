package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;

        int sum = num + 20;
        System.out.println("num 변수값: " + num);
        System.out.println("num + 20 = " + sum);
        System.out.printf("num 변수 값 : %d\n", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age = " + age + ", maxSpeed = " + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        // int num = 35; / 중복선언
        num = 35; // 같은 변수에 다른 값을 넣고 쓰고 싶다면 타입을 쓰지않고 변수만 쓴다
        final int MAX_SPEED = 20; // 상수 선언과 할당

    }
}
