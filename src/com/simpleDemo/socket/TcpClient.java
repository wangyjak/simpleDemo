package com.simpleDemo.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author : majh
 * createDate : 2019/5/19 19:49
 * descripe :
 */

public class TcpClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.129.203.54",65000);

        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        os.write(new String("hello world").getBytes());
        int ch = 0;
        byte[] buffer = new byte[1024];
        ch = is.read(buffer);

        String content = new String(buffer,0,ch);
        System.out.println(content);

        os.close();
        is.close();
        socket.close();
    }
}
