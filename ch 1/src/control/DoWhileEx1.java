package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터가 임의의 수 생성 : 1 ~ 100사이
        // 컴퓨터가 생성한 임의의 수 맞추기
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int num = 0;
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력하세요.:");
            num = Integer.parseInt(sc.nextLine());
            if (num < answer) {
                System.out.println("값이 작습니다.");
            } else if (num > answer) {
                System.out.println("값이 큽니다.");
            } else {
                System.out.println("정답입니다.");
            }
        } while (num != answer);

    }
}
