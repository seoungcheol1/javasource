package io;
// 2025.10.20

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf8"); // charset이 뭐지
            // utf8(유니코드 인코딩)
            // BufferedReader br = new BufferedReader(reader);

            // Writer out = new FileWriter("c:\\temp\\output2.txt");
            // BufferedWriter bw = new BufferedWriter(out);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("c:\\temp\\file1.txt"), "utf8"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\output2.txt"));

            // int input = in.read(); // 한 바이트씩 밖에 못 읽어와서 반복문을 쓴다

            String input = null;
            char[] cbuf = new char[1024];
            while ((input = br.readLine()) != null) { // 읽어오고 input에 대입 후 -1인지 아닌지 비교
                // cbuf => String

                bw.write(input);
                bw.newLine(); // 엔터추가
            }
            // in.close();
            bw.flush(); // 버퍼비우기
            bw.close();
            // out.close();
        } catch (IOException e) { // IOExceptiom이 FileNotFoundException의 부모라서 덮어쓴다
            e.printStackTrace();
        }
    }
}
