package object;

public class Student {
    // 멤버변수, 멤버메소드, 생성자
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)

    // 멤버변수
    String name;
    String tel;
    String address;

    // 생성자(constructor)
    public Student() {
    }

    // 메소드
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    // 결과 반환을 안한다 (return 이 없고 void 가 붙었다)
    // this 가 붙으면 이 클래스를 가리킨다
    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 이름 변경 메소드 생성
    // 리턴타입 메소드명 (매개변수1, 매개변수2...){}
    // void + 기본타입 - int, float, double..., 참조타입 - String, []
    // void changeName(String name) {
    // this.name = name;
    // }
    String changeName(String name) {
        this.name = name;
        return this.name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }

}
