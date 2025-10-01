package inheritance;

public class Child extends Parent {
    public Child() {
        super(15); // 평소에 숨겨져 있다 => 부모의 생성자 호출
    }

    void play() {
        System.out.println("Play!!!");
    }

    @Override
    public void list() {
        System.out.println("자식 클래스");
    }
}
