package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산 계산기
        // 2개의 숫자와 연산자 입력받기
        // 15, 25 +
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 수");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("연산자 입력");
        String opt = sc.nextLine();
        System.out.println("두번째 수");
        int num2 = Integer.parseInt(sc.nextLine());
        int result = 0;
        switch (opt) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 + num2;
                break;

            case "*":
                result = num1 + num2;
                break;

            case "/":
                result = num1 / num2;
                break;

            default:
                System.out.println("범위밖의 값");
                break;
        }
        System.out.printf("%d %s %d = %d", num1, opt, num2, result);
        sc.close();
    }
}
