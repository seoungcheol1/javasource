package inheritance;

// 추상 클래스, 인터페이스는 직접적으로 인스턴스 생성이 불가능하다

public class FighterEx {
    public static void main(String[] args) {
        // Attackable attackable = new Attackable() 오류

        Fightable fightable = new Fighter();
        Fighter fighter = new Fighter();
    }
}
