package object;

public class Account {
    // 은행계좌
    // 계좌번호 (120-12-111), 계좌주(홍길동), 잔액(100000)
    private String accountNo;
    private String owner;
    private long balance;

    public Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 입금한다(잔액 = 잔액 + 입금액) => 인자로 받아서 처리, 리턴 타입 없음 deposit
    void deposit(long input) {
        balance += input;
    }

    // 출금한다(잔액 = 잔액 - 출금액) => 인자로 받아서 처리 , 잔액 리턴 withdraw
    long withdraw(long input) {
        balance -= input;
        return balance;
    }

    // 속성 값 조회 : get ~
    public long getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

}
