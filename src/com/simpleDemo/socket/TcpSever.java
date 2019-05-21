package com.simpleDemo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : majh
 * createDate : 2019/5/19 19:49
 * descripe :
 */

public class TcpSever {
    public static void main(String[] args) throws IOException {
        //创建socket，并将socket绑定到65000端口
        ServerSocket ss = new ServerSocket(65000);
        //死循环，使得socket一直等待并处理客户端发送过来的请求
        while(true){
            //监听65000端口，直到客户端接收信息后返回
            Socket socket = ss.accept();

            new LengthCalculator(socket).start();
        }
    }
}
