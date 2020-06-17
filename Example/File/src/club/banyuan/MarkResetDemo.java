package club.banyuan;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MarkResetDemo {
    public static void main(String[] args) throws Exception {
        String str = "你好你好你好你好你好你好你好";
        FileOutputStream fileOutputStream = new FileOutputStream(new File("encodefile.txt"));
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();

        FileInputStream inputStream = new FileInputStream(new File("encodefile.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        reader.mark(18);
        System.out.printf("%c",reader.read());
        System.out.printf("%c",reader.read());
        System.out.printf("%c",reader.read());
        System.out.printf("%c",reader.read());
        //System.out.println(reader.readLine());
        System.out.println();
        reader.reset();
        System.out.printf("%c",reader.read());

//        for(byte aByte : str.getBytes(StandardCharsets.UTF_8)){
//            System.out.printf("%x",aByte);
//        }


    }
}
