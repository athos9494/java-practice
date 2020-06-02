package club.banyuan.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(10001);//发送端端口号可以默认随意分配
//        new InetSocketAddress()
        while(true){
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        byte[] bytes = word.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("127.0.0.1"),10000);
        //服务器端必须指定端口号

        datagramSocket.send(datagramPacket);}
    }
}
