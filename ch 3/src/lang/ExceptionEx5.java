package lang;

// 2025.10.16
// 멀티  catch
public class ExceptionEx5 {
    public static void main(String[] args) {

        try {
            // exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            // exception 발생하면 해야 하는 작업
            // e.printStackTrace(); // 추적
            // System.out.println(e.getMessage()); // For input string
            System.out.println("인자값을 확인하거나 입력값 확인");
        } catch (Exception e) { // Exception 은 부모라서 제일 밑에 있어야한다
            System.out.println(e.getMessage());
        }
    }
}
