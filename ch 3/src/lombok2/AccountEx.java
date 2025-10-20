package lombok2;
// 2025.10.20

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("홍길동", "110", 120000);

        // toString
        System.out.println(account);

        Account account2 = new Account();
        account2.setAccNo("220");
        account2.setBalance(20000);
        account2.setName("성춘향");

        // lombok에서 @Bulider를 써서 가능함
        Account account3 = Account.builder()
                .accNo("330")
                .balance(250000)
                .name("이수지")
                .build();
    }
}
