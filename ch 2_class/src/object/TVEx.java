package object;

public class TVEx {
    public static void main(String[] args) {
        // TV 클래스의 인스턴스 생성

        TV tv = new TV();
        // System.out.println(tv);
        // TV [size=0, channel=0, power=false, color=null]

        // tv.power = true;
        tv.setPower(true);

        // tv.size = 48;
        tv.setSize(48);

        // tv.channel = 3;
        tv.setChannel(3);

        // tv.color = "black";
        tv.setColor("balck");

        System.out.println(tv);
        // TV [size=48, channel=3, power=true, color=black]

        TV tv2 = new TV();
        tv2.setPower(true);
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);

        // 채널 +
        tv2.channelUp();
        System.out.println(tv2);

    }
}
