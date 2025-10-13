package exam;

public class ColorTV extends TV {
    public ColorTV(int size) {
        super(size);
    }

    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치" + this.color + "컬러");
    }

}
