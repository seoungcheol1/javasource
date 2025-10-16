package util;
// 2025.10.16

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataEx1 {
    public static void main(String[] args) {
        // 시스템 날짜와 시간 가져오기
        Date date = new Date();
        System.out.println(date); // Thu Oct 16 15:50:06 KST 2025

        // yyyy : year
        // MM : month
        // mm : minute
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println(sdf.format(date)); // 2025년 10월 16일 03시 54분 23초
    }
}
