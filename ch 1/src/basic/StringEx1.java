package basic;
// 타입

// 1. 기본타입 : byte, short, int, long, float, double, char, boolean
// 2. 참조타입: 기본형을 제외한 모든 타입

public class StringEx1 {
    public static void main(String[] args) {
        // 문자열 : ""
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";
        // 문자열이 같은가? ==, !=
        System.out.println(str1 == str2 ? "문자열이 같다" : "문자열이 다르다");

        // 저장공간이 달라서 다르다고 나온다
        String str3 = new String("안녕하세요");
        System.out.println(str1 == str3 ? "문자열이 같다" : "문자열이 다르다");

        // 문자열을 비교할 때 equals 참조타입 사용
        System.out.println(str1.equals(str3) ? "문자열이 같다" : "문자열이 다르다");
        System.out.println(str1.equalsIgnoreCase(str3) ? "문자열이 같다" : "문자열이 다르다");
        // abc != ABC 이지만 equalsIgnoreCase 를 사용하면 대소문자를 무시한다
        String str4 = "abc", str5 = "ABC";
        System.out.println(str4.equals(str5) ? "abc == ABC" : "abc != ABC");
        System.out.println(str4.equalsIgnoreCase(str5) ? "abc == ABC" : "abc != ABC");
    }
}
