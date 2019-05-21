package com.simpleDemo.socket;

import java.io.IOException;
import java.net.*;

/**
 * @author : majh
 * createDate : 2019/5/19 19:49
 * descripe :
 */

public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] buffer = "hello world".getBytes();
        InetAddress inetAddress = InetAddress.getByName("10.129.203.54");
        DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length,inetAddress,65001);

        datagramSocket.send(datagramPacket);

        byte[] data = new byte[100];
        DatagramPacket datagramPacketResult = new DatagramPacket(data,data.length);
        datagramSocket.receive(datagramPacketResult);

        String content = new String(datagramPacketResult.getData(),0,datagramPacketResult.getLength());
        System.out.println(content);
    }
}
