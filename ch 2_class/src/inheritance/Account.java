package inheritance;

public class Account {
    // 은행계좌
    // 계좌번호 (120-12-111), 계좌주(홍길동), 잔액(100000)
    private String accountNo;
    private String owner;
    private long balance;

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    // this => 나 자신의 생성자 호출
    public Account(String accountNo, String owner) {
        // this.accountNo = accountNo;
        this(accountNo);
        this.owner = owner;
    }

    public Account(String accountNo, String owner, long balance) {
        // this.accountNo = accountNo;
        // this.owner = owner;
        this(accountNo, owner);
        this.balance = balance;
    }

    // 입금한다(잔액 = 잔액 + 입금액) => 인자로 받아서 처리, 리턴 타입 없음 deposit
    void deposit(long input) {
        balance += input;
        // return balance;
    }

    // 출금한다(잔액 = 잔액 - 출금액) => 인자로 받아서 처리 , 잔액 리턴 withdraw
    long withdraw(long input) throws Exception {
        // 잔액 안에서 출금 허용
        if (input > balance) {
            throw new Exception("잔액 부족");
        }
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

    // setter
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
