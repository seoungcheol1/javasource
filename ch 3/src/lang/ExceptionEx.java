package lang;

// Throwable
// Exception(예외)
// 종류
// 1) 컴파일 예외 : ClassNotFoundException (컴파일러가 바로 알려준다)
// 2) 런타임 예외 : ArithmeticException (실행 이후에 알 수 있다)
// 처리방법
// 1) 예외처리
// 2) 예외 던지기
// Error
public class ExceptionEx {
    public static void main(String[] args) {
        // System.out.println(4 / 0); //java.lang.ArithmeticException

        try {
            Class.forName("null");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } // ClassNotFoundException
    }
}
