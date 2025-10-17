package util;
// 2025.10.17

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItme("홍길동"); // new String ("홍길동")
        // System.out.println(box1.getItme());
        String name = (String) box1.getItme();
        System.out.println(name);

        box1.setItme(33);// Integer.valueOf(33)
        Integer i = (Integer) box1.getItme();

        box1.setItme(33.14);// Double.valueOf(33.14)
        Double d = (Double) box1.getItme();

        Box2<String> box2 = new Box2<>();
        box2.setItme(name);
        String data = box2.getItme();
    }
}
