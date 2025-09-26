package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        // 선택 >> 1
        // 입금액 >> 100000

        // 선택 >> 2
        // 출금액 >> 20000
        // -------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // -------------------------------------
        // 선택 >> 3
        // 잔고 >> 80000
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        boolean run = true;
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >> ");
            int input1 = Integer.parseInt(sc.nextLine());
            switch (input1) {
                case 1:
                    System.out.print("입금액 >> ");
                    // int input2 = Integer.parseInt(sc.nextLine());
                    balance += Integer.parseInt(sc.nextLine());

                case 2:
                    System.out.print("출금액 >> ");
                    // int input3 = Integer.parseInt(sc.nextLine());
                    balance += Integer.parseInt(sc.nextLine());
                case 3:
                    System.out.println("잔액 >> " + balance);
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }

        }
    }
}
