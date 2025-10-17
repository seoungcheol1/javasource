package util;
// 2025.10.17

public class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Jucie";
    }

    @Override
    public String toString() {

        return name;
    }
}

class Jucier {
    static Juice makJuice(Box3<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}