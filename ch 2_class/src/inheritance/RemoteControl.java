package inheritance;

public interface RemoteControl {
    // 상수
    static final int MAX_VOLUME = 10;
    static final int MIN_VOLUME = 0;

    // 추상 메서드
    abstract void turnOn();

    abstract void turnOff();

    abstract void setVolume(int Volume);

    // 일반 메서드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        }

    }

    static void changeBattery() {
        System.out.println("건전지 교환");

    }
}
