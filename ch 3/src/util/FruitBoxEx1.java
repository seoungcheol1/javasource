package util;
// 2025.10.17

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        // appleBox.add(new Grape()); <Apple>이 있어서 Apple만 담을 수 있으므로 오류

        grapeBox.add(new Grape());
        toyBox.add(new Toy());

        Jucier.makJuice(fruitBox);
        Jucier.makJuice(appleBox);
        Jucier.makJuice(grapeBox);
    }
}
