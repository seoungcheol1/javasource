package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = { "Kim", "Park", "Yi" };
        // char 배열과 String 배열
        // String : char 배열 + 기능(메서드)
        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = "Park";
        strArr2[2] = "Yi";
        System.out.println(strArr2[0]);
        System.out.println("strArr2[0].charAt(0)" + strArr2[0].charAt(0)); // 문자열의 특정 개별 문자를 출력
        System.out.println(Arrays.toString(strArr));

        System.out.println(strArr[0].length());// 0번째 문자열의 길이 출력 length 에 괄호를 해야한다

        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }
        // src의 문자열을 개별로 출력했다

        // char[] chArr2 = src.toCharArray(); String => char 배열

        // char 배열 => String
        char[] chArr = { 'A', 'B', 'C', 'D', 'E' };
        String str2 = new String(chArr);
        System.out.println(str2);

    }
}
