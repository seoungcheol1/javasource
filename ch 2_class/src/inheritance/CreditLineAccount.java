package inheritance;

public class CreditLineAccount extends Account {
    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, long balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    @Override
    long withdraw(long input) throws Exception {
        // 출금 : 잔액(잔액 + 마이너스 한도) - 사용액
        // balance 는 private 이라서 바로 못 부른다
        // 부모 것 이라서 super를 붙인다 but 안붙여도 된다
        if (super.getBalance() + creditLine < input) {
            throw new Exception("마이너스 한도 확인");

        }
        // 잔액(잔액 + 마이너스한도) - 사용액
        setBalance(getBalance() - input);
        return super.getBalance();
    }

}
