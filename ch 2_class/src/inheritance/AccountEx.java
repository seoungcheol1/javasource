package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");

        // 입금
        checkingAccount.deposit(200000);
        // 입금 후 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());
        // 직불카드 사용
        try {
            System.out.println("체크카드 지불 후 잔액 : " + checkingAccount.pay("111-22", 300000));
        } catch (Exception e) {

            e.printStackTrace();
        }
        // 마이너스 한도
        CreditLineAccount creditLineAccount = new CreditLineAccount("111", "홍길동", 100000, 5000000);

        try {
            System.out.println("잔액 : " + creditLineAccount.withdraw(3000000));

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println();

        // 보너스 포인트
        BonusPointAccount bonusPointAccount = new BonusPointAccount("111", "홍길동", 0, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());
        bonusPointAccount.deposit(200000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());
        System.out.println("잔액 : " + bonusPointAccount.getBalance());

        System.out.println();

        // 교툥카드
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("111", "홍길동", 100000, "222", false);
        CheckingTrafficCardAccount cardAccount2 = new CheckingTrafficCardAccount("222", "성춘향", 100000, "444", true);

        // 예금
        cardAccount.deposit(100000);
        try {
            // 출금
            System.out.println("출금 후 잔액 : " + cardAccount.withdraw(100000));
            // 교통카드 기능없는데 교통카드 사용액 지불
            // cardAccount.payTrafficCard("222", 2100);

            // 교통카드 기능 있는 경우
            System.out.println("교통비 지급 후 잔액 " + cardAccount2.payTrafficCard("444", 2100));
        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
