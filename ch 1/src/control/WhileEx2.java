package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합 구하기
        // 345 : 3+ 4+ 5 =12
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        // num이 0 이 아닐때까지 반복
        while (num != 0) {
            sum = sum + num % 10;
            System.out.printf("sum = %d num = %d\n", sum, num);
            num = num / 10;

        }
        System.out.println("각 자릿 수 합 = " + sum);
    }
}
