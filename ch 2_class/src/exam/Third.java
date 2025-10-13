package exam;

public class Third {
    Parent parent = new Parent();

    public void info() {
        parent.setNum1(10);
        System.out.println(parent.name);
        System.out.println(parent.grade);
    }
}
