package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {

        System.out.println("가위(1), 바위(2), 보(3)");
        Scanner sc = new Scanner(System.in);
        // int 가위 = 1; 가위 바위 보 를 직접 입력해서 출력해보기
        // int 바위 = 2;
        // int 보 = 3;
        int user = Integer.parseInt(sc.nextLine());
        // Math.random() : 0 <= x < 1 의 난수를 추출
        int com = (int) (Math.random() * 3) + 1;
        // System.out.println(com);
        switch (user - com) {
            case 2:
            case -1:
                System.out.println("당신이 졌습니다");
                break;
            case 1:
            case -2:
                System.out.println("당신이 이겼습니다");
                break;
            case 0:
                System.out.println("비겼습니다");
                break;

            default:
                break;
        }

    }
}
