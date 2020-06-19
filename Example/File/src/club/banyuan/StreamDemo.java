package club.banyuan;

import java.io.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String target = Math.random()+"";

        fileOutputStream.write(target.getBytes());
        fileOutputStream.close();

        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = inputStream.readAllBytes();
        System.out.println("读取文件内容");
        System.out.println(new String(bytes));
        inputStream.close();




    }
}
