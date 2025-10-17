package util;
// 2025.10.17

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        // 1 ~ 45 => 6개 숫자를 무작위로 추출
        // List, Set
        Set<Integer> set = new HashSet<>(); // int는 못담는다

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45 + 1);
            set.add(num);

        }
        System.out.println(set);

        Set<Integer> set2 = new TreeSet<>(); // 정렬이 되어서 출력된다

        for (int i = 0; set2.size() < 6; i++) {
            int num = (int) (Math.random() * 45 + 1);
            set2.add(num);

        }
        System.out.println(set2);
    }
}
