package object;

import java.util.Scanner;

public class AccountEx3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 배열 선언과 생성
        Account[] accounts = new Account[100];

        boolean run = true;
        while (run) {
            System.out.println("------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.print("선택 >> ");
            int no = Integer.parseInt(sc.nextLine());
            switch (no) {
                case 1:
                    // createAccount(sc);
                    createAccount(accounts);
                    break;
                case 2:
                    accountList(accounts);
                    break;
                case 3:
                    deposit(accounts);
                    break;
                case 4:
                    withdraw(accounts);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴 번호 확인 ");
                    break;
            }
        }
        // Account[] accounts = new Account[3];

        // accounts[0] = new Account("111", "홍길동", 10000);
        // accounts[1] = new Account("222", "성춘향", 20000);
        // accounts[2] = new Account("333", "이순신", 30000);

        // // 성춘향 계좌에 입금
        // accounts[1].deposit(100000);
        // System.out.println(accounts[1].getOwner() + " : " +
        // accounts[1].getBalance());
    }

    // static void createAccount(Scanner sc) {
    static void createAccount(Account[] accounts) {
        // 계좌생성

        System.out.print("계좌번호 입력 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < accounts.length; j++) {
            if (accounts[j] == null) {
                accounts[j] = new Account(accountNo, owner, balance);
                break; // 하나 저장하고 멈춰야한다
            }
        }

    }

    static void withdraw(Account[] accounts) {
        // 출금담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 출금액 입력 받아 계좌 잔액 추가
            // witdraw() 호출
            System.out.print("출금하실 금액을 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            // account.withdraw(input);
            long balance = account.withdraw(input);
            System.out.println("현재 잔액 : " + balance);
        }
    }

    static void deposit(Account[] accounts) {
        // 입금담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 입금액 입력 받아 계좌 잔액 추가
            // depoist() 호출
            System.out.print("입금하실 금액을 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            account.deposit(input);
            // long balance = account.deposit(input);
            // System.out.println("현재 잔액 : " + balance);
        }
    }

    // 리턴타입이 account 를 리턴해야하기 때문에 Account 이다
    static Account findAccount(Account[] accounts) {
        // 입력받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();
        for (Account account : accounts) {
            if (accounts != null) {
                if (account.getAccountNo().equals(accountNo)) {
                    return account;
                }
            }
        }
        return null;
    }

    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (account != null) {

                System.out.println("========================== ");
                System.out.println("1. 계좌번호 : " + account.getAccountNo());
                System.out.println("2. 계좌주 : " + account.getOwner());
                System.out.println("3. 잔액 : " + account.getBalance());
                System.out.println("========================== ");
                System.out.println(account.getAccountNo());
            }

        }
    }
}
