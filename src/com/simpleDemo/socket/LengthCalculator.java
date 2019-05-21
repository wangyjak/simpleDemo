package com.simpleDemo.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author : majh
 * createDate : 2019/5/19 19:54
 * descripe :
 */

public class LengthCalculator extends Thread {

    private Socket socket;

    public  LengthCalculator(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            //获取socket输入流
            InputStream is = socket.getInputStream();
            //获取socket输出流
            OutputStream os = socket.getOutputStream();

            int ch = 0;
            byte[] buff = new byte[1024];

            ch = is.read(buff);
            String content = new String(buff,0,ch);
            System.out.println(content);

            os.write(String.valueOf(ch).getBytes());

            is.close();
            os.close();
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
