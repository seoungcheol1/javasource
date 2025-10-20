package io;
// 2025.10.20

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class ReaderEx2 {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("c:\\temp\\file1.txt");
            InputStreamReader reader = new InputStreamReader(in, "utf8"); // charset이 뭐지 utf8?
            Writer out = new FileWriter("c:\\temp\\output2.txt");
            // int input = in.read(); // 한 바이트씩 밖에 못 읽어와서 반복문을 쓴다

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = reader.read(cbuf)) != -1) { // 읽어오고 input에 대입 후 -1인지 아닌지 비교
                // cbuf => String

                out.write(new String(cbuf));
            }
            in.close();
            out.close();
        } catch (IOException e) { // IOExceptiom이 FileNotFoundException의 부모라서 덮어쓴다
            e.printStackTrace();
        }
    }
}
