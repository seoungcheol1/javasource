package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간까지는 10030
        // 8시간 이후에는 원래 받던 금액의 1.5배를 받는다
        // 오늘 근무시간을 입력 받은 후 하루 일당 산출
        // 일당은 정수형

        Scanner sc = new Scanner(System.in);
        System.out.println("근무 시간을 입력하세요.");
        int pay = Integer.parseInt(sc.nextLine());
        if (pay <= 8) {
            System.out.printf("근무 시간 = %d 하루 일당 = %d", pay, (pay * 10030));
        } else {
            System.out.printf("근무 시간 = %d 하루 일당 = %d", pay, ((int) (8 * 10030 + (pay - 8) * 10030 * 1.5)));
        }
        sc.close();
    }
}
