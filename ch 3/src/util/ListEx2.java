package util;

// 2025.10.16
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        // 리스트 생성
        List<String> list1 = new ArrayList<>(30);
        ArrayList<String> list2 = new ArrayList<>(30);
        List<String> list3 = List.of("사과", "포도", "딸기", "수박");
        List<String> list6 = new ArrayList<>(List.of("사과", "포도", "딸기", "수박"));
        list6.add("바나나");
        // 배열로 리스트 생성하기
        String[] fruits = { "사과", "포도", "딸기", "수박" };
        List<String> list4 = Arrays.asList(fruits);

        list1.add("사과");
        list2.add("사과");
        // list3.add("바나나"); List.of 도 변경 불가능하다
        // list4.add("바나나");//UnsupportedOperationException

        String[] fruits2 = { "사과", "포도", "딸기", "수박" };
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("바나나");
    }
}
