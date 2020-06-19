package club.banyuan.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {

    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 10000)) {
            System.out.println("客户端启动");

            OutputStream outputStream = socket.getOutputStream();
//            Scanner scanner = new Scanner(System.in);
//            String s = scanner.nextLine();
            outputStream.write("你好".getBytes());
            System.out.println("发送成功");

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = inputStream.readAllBytes();
            System.out.println("来自服务器的消息:" + new String(bytes));

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("客户端退出");
    }
}