package club.banyuan.udp;

import java.net.*;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(10000);
//        new InetSocketAddress()

        byte[] bytes = new byte[1024];
        while (true){
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        //System.out.println("before received");


        //System.out.println(datagramPacket.getAddress());
        //System.out.println(datagramPacket.getPort());
        datagramSocket.receive(datagramPacket);
        //System.out.println("after received");

        byte[] data = datagramPacket.getData();
       // System.out.println(data == bytes);
        System.out.println(new String(data,0,datagramPacket.getLength()));
        //System.out.println(datagramPacket.getAddress().getHostAddress());
        }
        //datagramSocket.close();
    }
}
