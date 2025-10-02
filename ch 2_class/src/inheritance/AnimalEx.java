package inheritance;

// 다형성 (polymorphism)
// 여러가지 형태를 가질 수 있는 능력
// 부모 = new 자식()

// print(자식)
// void print(부모){};
public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Animal animal = new Animal();

        Carnivore carnivore = new Carnivore();
        carnivore.eat(); // 고기를 ~
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        // 자식 = 부모로 강제 형변환은 안된다
        // herbivore = (Herbivore) animal; // 오류
        herbivore.eat(); // 채소를 ~

        // 부모 = 자식
        // Animal animal = new Carnivore(); // 부모걸로 인스턴스 생성해서 부모거에 있는거 밖에 못쓴다
        // animal.eat();
        // ((Carnivore) animal).print(); // 강제 형변환해서 불러왔다
        // animal = new Herbivore();
        // animal.eat();

        // Carnivore carnivore2 = new Carnivore();
        // herbivore = (Herbivore)carnivore2; => 자식끼리는 아무런 관계도 없어서 오류
    }
}
