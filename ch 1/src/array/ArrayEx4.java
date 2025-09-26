package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        // 최소값과 최대값 출력
        int min = score[0], max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            } else if (max < score[i]) {
                max = score[i];
            }

        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);
    }
}
