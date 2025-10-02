package inheritance;

//  final
//  class : 상속불가
//  method : 오버라이딩 금지
public /* final */ class Person {
    // final : 마지막의, 변경될 수 없는

    static final int Max = 15; // final을 붙여 상수를 나타낸다 어차피 상수이기 때문에 static을 붙여 최적화 한다
    String name;

    public Person(String name) {
        this.name = name;
    }

    final void test() {

    }

}
