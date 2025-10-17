package util;
// 2025.10.17

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1 ~ 45 => 6개 숫자를 무작위로 추출
        // List, Set
        Set<Integer> set = new HashSet<>(); // int는 못담는다

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45 + 1);
            set.add(num);

        }
        System.out.println(set);

        // Collection(부모)<? extends Integer> c

        // Collections.sort(List<T> list, Comparator<? super T> c)
        // 첫번째 인자 : List, List 자식(ArrayList, LinkedList, Stack...)
        // List<String> list = new ArrayList<>();
        // 두번째 인자 :
        // Comparator<? super String> c : Comparator, Comparator 자식
        // String 이거나 String 부모
        // set => list 변환
        List<Integer> list = new LinkedList<>(set);
        // 정렬
        Collections.sort(list);
        System.out.println(list);

        // list => set 변환
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);
    }
}
