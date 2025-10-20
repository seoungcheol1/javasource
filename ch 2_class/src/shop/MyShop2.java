package shop;

// 2025.10.20
// myshop의 배열을 List로 바꿔본다
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {
    private String title;
    // Product[] products = new Product[5];
    // 숫자 지정 안하면 10개를 담을 수 있는 공간 생성
    List<Product> products = new ArrayList<>();

    // 장바구니
    // Product[] carts = new Product[5];
    List<Product> carts = new ArrayList<>();

    // User
    // User[] users = new User[2];
    List<User> users = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    // 선택된 사용자 idx 보관
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    // 메뉴
    @Override
    public void start() {
        System.out.println(title + " : 메인 화면 - 계정 선택");
        System.out.println("================================");
        int i = 0;
        for (User user : users) {
            System.out.printf("{%d}%s(%s)\n", i++, user.getName(), user.getPaytype());
        }
        System.out.println("[x]종 료");
        System.out.print("선택 : ");
        String sel = sc.nextLine();
        switch (sel) {
            case "x":
            case "X":
                System.out.println("**프로그램 종료**");
                System.exit(0);
                break;

            default:
                // 선택된 user 정보처리
                selUser = Integer.parseInt(sel);
                break;
        }

        System.out.printf("## %s 선택 ##\n", sel);
        // 상품 출력
        productList();
    }

    // 상품출력
    @Override
    public void productList() {
        System.out.println(title + ": 상품 목록 - 상품 선택");
        System.out.println("================================");

        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i);
            product.printDetail();
            i++;
        }
        System.out.println("[h] 메인 화면");
        System.out.println("[c] 체크 아웃");
        System.out.print("선택 : ");
        String sel = sc.nextLine();
        // 사용자 입력 : 상품번호, h, c
        switch (sel) {
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;

            default:
                int no = Integer.parseInt(sel);

                // for (int j = 0; j < carts.size(); j++) {
                // if (carts == null) {
                // carts = products[no];
                // break;
                // }
                // }

                carts.add(products.get(no));
                productList();
                // 상품목록 보여주기
                break;
        }

        // 상품번호 0 선택 시 => cart 담기 (1. 배열의 비어있는 위치 찾기 2. 담기)
        // 상품번호 1 선택 시 => cart 담기
        // 상품목록 보여주기 => c => 결제처리 메소드 호출
        // 상품목록 보여주기 => h => 계정 선택

    }

    // 결제처리
    @Override
    public void checkOut() {

        System.out.println(title + ": 체크아웃");
        System.out.println("================================");
        int i = 0;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("================================");
        System.out.println("결제 방법 : " + users.get(selUser).getPaytype());
        System.out.println("합계 : " + sum);
        System.out.println("[p] 이전, [q] 결제 완료");
        System.out.print("선택 : ");
        String sel = sc.nextLine();
        switch (sel) {
            case "q":
                System.out.println("### 결제가 완료되었습니다. 종료합니다 ###");
                System.exit(0);
                break;
            case "p":
                productList();
                break;

            default:
                checkOut();
                break;
        }
    }

    // 사용자 등록
    @Override
    public void genUser() {
        // 2명 사용자 등록
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    // 상품 등록
    @Override
    public void genProduct() {
        products.add(new TV("삼성TV", 2300000, "4K"));
        products.add(new TV("LGTV", 2250000, "4K"));
        products.add(new CellPhone("갤럭시Z폴드", 1200000, "U+"));
        products.add(new CellPhone("갤럭시S23", 600000, "SKT"));
        products.add(new CellPhone("아이폰17", 1350000, "KT"));
    }

}
