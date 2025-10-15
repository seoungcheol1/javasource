package lang;

import java.lang.reflect.Array;
import java.util.Arrays;

// String => immutable(원본 변경불가)
// StringBuffer, StringBuilder => mutable
// 멀티쓰레드 / 단일쓰레드
public class StringEx2 {
    public static void main(String[] args) {
        // 1. concat() : 다른 문자열 뒤에 덧붙이기
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;
        String str4 = "HelloWorld";
        System.out.println(str3);

        // 리턴타입 존재 => 1) 출력문 2) 변수
        System.out.println("concat() : " + str1.concat(str2));

        // 2. contains() : 문자열 포함 여부
        boolean result = str3.contains(str1);
        boolean result2 = str4.contains(str1);
        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 문자열에 str1 문자열이 포함되지 않음");
        }
        System.out.println(result);
        System.out.println(result2);
        System.out.println();

        // 3. compareTo() : 문자열 사전순서로 비교
        str1 = "aaa";

        str2 = "bbb";
        System.out.println("str1.compareTo(aaa)" + str1.compareTo("aaa")); // 0
        System.out.println("str1.compareTo(str2)" + str1.compareTo(str2)); // -1
        System.out.println("str1.compareTo(str1)" + str2.compareTo(str1)); // 1
        System.out.println();

        // 4. endsWith() : 지정된 문자열로 끝나는지 검사
        String fileName = "file.txt";
        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }
        // 5. equals() : 문자열 비교 , equalsIgnoreCase() : 대소문자 구별 없이 비교
        System.out.println("aaa".equals("cccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));
        System.out.println();

        // 6. indexOf : 문자열에서 문자의 위치값 리턴
        // indexOf(문자, 찾을 시작 위치) : 문자열에서 문자의 위치값 리턴
        str1 = "Hello";
        System.out.println("str1.indexOf('e') " + str1.indexOf('e'));
        System.out.println("str1.indexOf('k') " + str1.indexOf('k')); // 못찾으면 -1
        System.out.println("str1.indexOf('e') " + str1.indexOf('e', 2));
        System.out.println("str1.indexOf('ll') " + str1.indexOf("ll"));
        System.out.println();

        // 7. lastIndexOf()
        str1 = "java.lang.Object";
        System.out.println("str1.lastIndexOf('.') " + str1.lastIndexOf('.')); // 9 뒤에서부터 찾는다
        System.out.println("str1.indexOf('.') " + str1.indexOf('.'));// 4 앞에서부터 찾는다
        System.out.println();
        // 8. length() : 문자열 길이 반환
        int arr[] = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
        }

        // 9. replace()
        str1 = "Hello";
        System.out.println(str1.replace('H', 'K'));
        System.out.println("Hellollo".replace("ll", "LL"));
        // regex : 정규식
        System.out.println("Hellollo".replaceAll("ll", "LL"));
        System.out.println("Hellollo".replaceFirst("ll", "LL"));
        System.out.println(str1); // 원본이 바뀌지 않았다
        System.out.println();

        // 10. split()
        String animals = "dog, cat, bear";
        String[] arr2 = animals.split(", ");
        System.out.println(arr2); // [Ljava.lang.String;@38af3868
        System.out.println(Arrays.toString(arr2));
        for (String s : arr2) {
            System.out.println(s);
        }

        String[] arr3 = animals.split(", ", 2);
        for (String s : arr3) {
            System.out.println(s);
        }
        System.out.println();

        // 11. startWith(prefix) : 주어진 문자열 prefix로 시작하는지 검사 <==> endsWith()
        str1 = "java.lang.Object";
        System.out.println("str1.startsWith(\"java\")" + str1.startsWith("java"));
        System.out.println("str1.startsWith(\"lang\")" + str1.startsWith("lang"));
        System.out.println("str1.startsWith(\"lang\")" + str1.startsWith("lang", 5));
        System.out.println();

        // 12. substring(beginIndex) : 시작위치부터 문자열을 얻어낸다
        // substring(beginIndex,endsIndex) : 시작위치 ~ 끝위치까지 문자열을 얻어낸다 (endsIndex 숫자 문자열은
        // 미포함)
        System.out.println("12. java.lang.Object (10) : " + str1.substring(10));
        System.out.println("str1.substring(5, 9) " + str1.substring(5, 9));
        System.out.println();

        // 13. toLowerCase() / toUpperCase()
        System.out.println("abcdefg".toUpperCase());
        System.out.println("AbCdEfG".toLowerCase());
        System.out.println();

        // 14. trim() : 양 끝에 존재하는 공백 제거(중간 공백은 제외)
        System.out.println("                       Heoll World".trim());
        System.out.println("                       Heoll World             ".trim());
        System.out.println("                       Heoll          World    ".trim());
        System.out.println();

        // 15. valueOf(값) : 지정된 값을 문자열로 변환해서 반환
        str4 = String.valueOf(5);
        int i = 3;
        str4 = i + " ";
        str4 = String.valueOf(10.3f);
        System.out.println(str4);
    }
}
