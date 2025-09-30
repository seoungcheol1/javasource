package object;

public class DataEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Data data = new Data(); // 이 객체가 저정되는 다른 곳이 있다는 뜻
        data.x = 10;
        change(data.x);
        System.out.println("change 호출 후 " + data.x);// 변경되지 않는다
        change(data);
        System.out.println("change (Data d) 호출 후 " + data.x);// 변경된다

        Data data2 = copy(data);
        System.out.println("data2.x = " + data2.x);
    }

    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }

    public static void change(Data d) {
        d.x = 15;
        System.out.println("변경 후 " + d.x);
    }

    public static void change(int x) {
        x = 15;
        System.out.println("변경 후 " + x);
    }
}
