package club.banyuan;

import java.io.*;

public class EncodeDemo {
    public static void main(String[] args) throws Exception {
        String str = "你好";
//        byte[]bytes = str.getBytes();
//        System.out.println(bytes);
        FileOutputStream fileOutputStream = new FileOutputStream(new File("encodefile.txt"));
        fileOutputStream.write(str.getBytes("utf-8"));
        fileOutputStream.close();

        FileInputStream inputStream = new FileInputStream(new File("encodefile.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
        System.out.println(reader.readLine());


    }
}
