package com.Wayne_04_decorator_pattern;

import java.util.ArrayList;
import java.util.Arrays;

/*
    原始类
*/
public class FileInputStream extends InputStream {
    @Override
    public int read() {
        System.out.println("低性能的方式读取一个字节a");
        return 0;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0] = 97;
        buffer[1] = 98;
        buffer[2] = 99;
        System.out.println("低性能的方式读取一个字节数值" + Arrays.toString(buffer));

        return 3;
    }
}
