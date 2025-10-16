package util;
// 2025.10.16

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 2, 3, 4 };

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result ? "배열요소 같음" : "배열요소 다름");

        int[][] original = { { 1, 2 }, { 3, 4 } };
        int[][] coloned = Arrays.copyOf(original, original.length);

        System.out.println("주소 비교" + original.equals(coloned)); // 변수가 선언된 위치가 같냐? false
        // 원본 주소가 가리키는 결과값의 주소를 비교한다 / 같은 결과값을 가리키므로 같음 출력
        System.out.println(Arrays.equals(original, coloned) ? "배열요소 같음" : "배열요소 다름");

        // 얕은 복사 : copyOf()
        // 깊은 복사 : 새 공간 생성 + 값 옮기기
        System.out.println("깊은 복사");
        int[][] coloned2 = Arrays.copyOf(original, original.length);
        coloned2[0] = Arrays.copyOf(original[0], original[0].length);
        coloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println("주소 비교" + original.equals(coloned2));
        // 복사해서 같은 결과값이지만 다른 공간에 위치해있어 다름 출력
        System.out.println(Arrays.equals(original, coloned2) ? "배열요소 같음" : "배열요소 다름");
        System.out.println(Arrays.deepEquals(original, coloned2) ? "배열요소 같음" : "배열요소 다름");
    }
}
