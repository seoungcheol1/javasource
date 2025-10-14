package shop;

public interface IShop {

    void setTitle(String title);

    // 메뉴
    void start();

    // 상품출력
    void productList();

    // 결제처리
    void checkOut();

    // 사용자 등록
    void genUser();

    // 상품 등록
    void genProduct();

}