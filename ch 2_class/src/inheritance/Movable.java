package inheritance;

//  멤버변수에 final 을 붙이면 상수 => 반드시 초기화 필요

public interface Movable {
    // 상수 선언만 가능
    // final 이 없어도 상수로 인식
    int pos = 0;
    // int pos; <= 오류

    // abstract 이 없어도 추상 메서드로 인식
    void move(int x, int y); // {}가 없어야 한다

    // static, default

    static void print() {

    }

    default void print2() {

    }
}
