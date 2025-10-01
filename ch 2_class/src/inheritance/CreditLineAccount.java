package inheritance;

public class CreditLineAccount extends Account {
    private int limit; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, long balance, int limit) {
        super(accountNo, owner, balance);
        this.limit = limit;
    }

    @Override
    long withdraw(long input) throws Exception {
        // TODO Auto-generated method stub
        return super.withdraw(input);
    }

}
