package lang;

// 2025.10.16
public class WrongPasswordException extends Exception {
   public WrongPasswordException() {
   }

   public WrongPasswordException(String message) {
      super(message);
   }
}
