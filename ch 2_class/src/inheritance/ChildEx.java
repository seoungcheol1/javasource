package inheritance;

public class ChildEx {
    public static void main(String[] args) {
        // Parent parent = new Parent(5);
        Child child = new Child();
        Child2 child2 = new Child2();

        // System.out.println(parent.age);
        System.out.println("child age " + child.age);
        child.play();
        child.list(); // 자식 클래스
        System.out.println("child2 " + child2.age);
        child2.list(); // 부모 클래스
    }
}
