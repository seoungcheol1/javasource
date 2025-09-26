package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0~9의 숫자로 초기화
        // int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        System.out.println(Arrays.toString(arr1));

        // int x = 10, y = 5;
        // // x => y, y=> x 값 교환
        // int temp = x;
        // x= y;
        // y= temp;

        // 0~9 사이의 임의의 수 추출
        for (int i = 0; i < 100; i++) {
            int ran = (int) (Math.random() * 10);

            int temp = arr1[0];
            arr1[0] = arr1[ran];
            arr1[ran] = temp;

        }
        System.out.println(Arrays.toString(arr1));
    }
}
