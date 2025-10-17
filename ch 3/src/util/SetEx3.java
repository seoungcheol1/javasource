package util;
// 2025.10.17

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("hong12", "hong12", "홍길동"));
        set.add(new Member("hong13", "hong13", "홍길동"));
        set.add(new Member("hong14", "hong14", "홍길동"));
        set.add(new Member("hong12", "hong12", "홍길동"));

        for (Member member : set) {
            System.out.println(member); // hong12 가 중복인데 중복저장되었다
            // Member 클래스에서 equals와 hashCode를 오버라이딩해서 재정의하자 중복이 제거되었다
        }

    }
}
