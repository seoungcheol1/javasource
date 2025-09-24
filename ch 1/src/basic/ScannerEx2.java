package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // println(): 출력 후 엔터
        // printf(): 엔터 없이 출력
        // print(): 엔터 없이 포멧지정
        System.out.print("두자리 정수 입력");
        String num = sc.nextLine();
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1));

        int input = Integer.parseInt(num);
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1));
    }
}