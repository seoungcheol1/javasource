package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AV345AB", "AB"));
        System.out.println(count("12345BC", "AB"));
    }

    public static int count(String src, String target) {
        // target 이 src 내에 몇번 나오는가?
        // indexOf
        // int count = 0;
        // for (int i = 0; i < src.length(); i++) {
        // if (src.indexOf(target, i) > 0) {
        // count++; // count 값을 초기화하고 타겟이 잡힐 때마다 1씩 오르도록 한다
        // i = src.indexOf(target, i); // 카운트가 오르면 나오는 값을 i 에 저장해 시작위치를 변경

        // }

        // }
        int count = 0;
        int pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            pos = pos + target.length();
            count++;
        }
        return count;
    }
}
