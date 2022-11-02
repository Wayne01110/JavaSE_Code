package com.Wayne_06;

import java.util.function.Function;

/*
    String s = "林青霞,30";
    请按照我的指定的要求进行操作：
        1：将字符串截取得到数字年龄部分
        2：将上一步的年龄字符串转换成为int类型的数据
        3：将上一步的int数据加70，得到一个int结果，在控制台输出
    请通过Function接口来实现函数拼接
*/
public class FunctionTest {
    public static void main(String[] args) {
        String s = "林青霞,30";

        convert(s, ss -> ss.split(",")[1], ss -> Integer.parseInt(ss) + 70);

    }

    private static void convert(String ss, Function<String, String> fun1, Function<String, Integer> fun2) {
        int i = fun1.andThen(fun2).apply(ss);
        System.out.println(i);
    }
}
