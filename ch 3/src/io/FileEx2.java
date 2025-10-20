package io;
// 2025.10.20

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("c:\\temp");

        File[] files = currDir.listFiles();

        for (File file : files) {
            System.out.println(file.getName());
        }

        if (!currDir.exists()) {
            currDir.mkdir();
        }

        File dir = new File("c:\\temp\\dir");
        File file1 = new File("c:\\temp\\dir\\file1.txt");
        File file2 = new File("c:\\temp\\file1.txt");
        File file3 = new File("c:\\temp\\file2.txt");

        if (!dir.exists())
            dir.mkdir();
        try {
            if (!file1.exists())
                file1.createNewFile();

            if (!file2.exists())
                file2.createNewFile();

            if (!file3.exists())
                file3.createNewFile();
        }

        catch (IOException e) {

            e.printStackTrace();
        }

        files = currDir.listFiles();

        // a : am/pm
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        // 날짜형식
        // 1. java.util.Date
        // 2. java.time.LocalDate
        // LocalDate.ofEpochDay(0)

        System.out.println("\t날짜      시간        형태        크기        이름");
        System.out.println("====================================================");
        for (File file : files) {
            System.out.println(new Date(file.lastModified()));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + file.getName());
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }

    }

}
