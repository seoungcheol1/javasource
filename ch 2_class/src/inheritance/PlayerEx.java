package inheritance;

public class PlayerEx {
    public static void main(String[] args) {
        Player player = new CDPlayer(); // 왼쪽은 부모 오른쪽은 자식
        CDPlayer cdPlayer = new CDPlayer();

        player.pause = true;
        player.currentPos = 7;
        // 다형성 : 오버라이딩 시 자식 클래스의 메소드가 실행됨
        player.paly(8);
        player.stop();
        System.out.println();

        cdPlayer.currentPos = 8;
        cdPlayer.pause = false;
        cdPlayer.currentTrack = 9;
        cdPlayer.paly(1);
        cdPlayer.newTrack();
    }
}
