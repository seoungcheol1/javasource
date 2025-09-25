package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를입력받아 가장 작은 값 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("세 개의 정수 입력하기");
        int input1 = Integer.parseInt(sc.nextLine());
        int input2 = Integer.parseInt(sc.nextLine());
        int input3 = Integer.parseInt(sc.nextLine());
        // if (input1 <= input2 && input1 <= input3) {
        // System.out.println("가장 작은 수 = " + input1);
        // } else if (input2 <= input3 && input2 <= input1) {
        // System.out.println("가장 작은 수 = " + input2);
        // } else {
        // System.out.println("가장 작은 수 = " + input3);
        // }
        int min = input1;
        if (min > input2) {
            min = input2;
        }
        if (min > input3) {
            min = input3;
        }
        System.out.println("가장 작은 수 = " + min);
        sc.close();
    }
}
