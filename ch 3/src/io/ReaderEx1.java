package io;
// 2025.10.20

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {
    public static void main(String[] args) {
        try {

            Reader in = new FileReader("c:\\temp\\file1.txt");
            Writer out = new FileWriter("c:\\temp\\output2.txt");
            // int input = in.read(); // 한 바이트씩 밖에 못 읽어와서 반복문을 쓴다

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = in.read(cbuf)) != -1) { // 읽어오고 input에 대입 후 -1인지 아닌지 비교
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
