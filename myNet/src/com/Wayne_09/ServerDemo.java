package com.Wayne_09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器ServerSocket对象
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接，返回一个对应的Socket对象
        Socket s = ss.accept();

        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\Copy.java"));

        String line;
        while ((line = br.readLine()) != null) { //等待读取数据
//            if ("886".equals(line)) {
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(11111);

        //给出反馈
        BufferedWriter bwSever = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwSever.write("文件上传成功");
        bwSever.newLine();
        bwSever.flush();

        //释放资源
        bw.close();
        ss.close();
    }
}
