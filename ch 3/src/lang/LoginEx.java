package lang;

// 2025.10.16
public class LoginEx {
    public static void main(String[] args) {
        try {
            login("white", "12345");
            login("blue", "54321");
        } catch (NotExistException | WrongPasswordException e) {

            e.printStackTrace();
        }

    }

    public static void login(String id, String password) throws NotExistException, WrongPasswordException {
        // id가 blue가 아니라면 NotExistException 발생
        if (!id.equals("blue")) {
            throw new NotExistException("아이디 확인");
        }
        // password가 "12345"가 아니라면 WrongPasswordException 발생
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호 확인");
        }
    }
}
