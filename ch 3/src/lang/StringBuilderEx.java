package lang;

// String => immutable(원본 변경불가)
// StringBuffer, StringBuilder => mutable
// 멀티쓰레드 / 단일쓰레드
public class StringBuilderEx {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        StringBuilder builder = new StringBuilder();
        // StringBuilder builder2 = "new StringBuilder()"; <= 오류

        String str1 = "abc";
        String str2 = str1.concat("bcd"); // 원본이 바뀌지 않고 새로운 문자열로 받는다

        builder.append("abc").append("bcd").append("def"); // 원본 변경
        System.out.println(builder);

        builder.delete(0, 2); // 끝 위치 포함 안함
        System.out.println(builder);
        builder.deleteCharAt(1);
        System.out.println(builder);
        builder.insert(1, "홍길동");
        System.out.println(builder);
        builder.replace(1, 3, "성춘향");
        System.out.println(builder);

        builder = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder);
        System.out.println(builder2);
        System.out.println(builder.equals(builder2) ? "같음" : "다름");
        // StringBuilder => String

        str1 = builder.toString();
        // str2 = builder.toString();
        str2 = new String(builder2);
        System.out.println(str1.equals(str2));

        String str3 = "안녕하세요"; // 원본이 지워지고 새 문자열로 출력된다
        str3 += "반갑습니다";
        str3 += "Hello";
        System.out.println(str3);
    }
}
