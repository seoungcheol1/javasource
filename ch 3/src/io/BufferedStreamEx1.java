package io;
// 2025.10.20

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamEx1 {
    public static void main(String[] args) {
        try {

            // InputStream in = new FileInputStream("c:\\temp\\img1.jpg");
            // BufferedInputStream bis = new BufferedInputStream(in);

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\temp\\img1.jpg"));

            // OutputStream out = new FileOutputStream("c:\\temp\\copy3.jpg");
            // BufferedOutputStream bos = new BufferedOutputStream(out);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\temp\\copy3.jpg"));
            // int input = in.read(); // 한 바이트씩 밖에 못 읽어와서 반복문을 쓴다

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = bis.read(bytes)) != -1) { // 읽어오고 input에 대입 후 -1인지 아닌지 비교
                // System.out.print((char) input); // 한 바이트씩 읽어와서 한글 출력 불가능
                bos.write(bytes);
            }
            // in.close();
            bos.flush(); // 버퍼 비우기
            // out.close();
        } catch (IOException e) { // IOExceptiom이 FileNotFoundException의 부모라서 덮어쓴다
            e.printStackTrace();
        }
    }
}
