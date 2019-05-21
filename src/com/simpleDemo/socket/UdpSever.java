package com.simpleDemo.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author : majh
 * createDate : 2019/5/19 19:49
 * descripe :
 */

public class UdpSever {

    public static void main(String[] args) throws IOException {
        //udp实现类
        DatagramSocket datagramSocket = new DatagramSocket(65001);

        byte[] buffer = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(buffer,buffer.length);

        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        String content = new String(data,0,datagramPacket.getLength());
        System.out.println(content);
        byte[] result = String.valueOf(content.length()).getBytes();

        DatagramPacket packetToClient = new DatagramPacket(result,result.length,datagramPacket.getAddress(),datagramPacket.getPort());
        datagramSocket.send(packetToClient);
    }
}
