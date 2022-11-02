package com.Wayne_01;

import java.util.HashMap;
import java.util.Map;

/*
    Map集合的基本功能：
        V put(K key,V value)：添加元素
        V remve(Object key)：根据键删除键值对元素
        void clear()：移除所有的键值对元素
        boolean containsKey(Object key)：判断集合是否包含指定的键
        boolean containsValue(Object value):判断集合是否包含指定的值
        boolean isEmpty()：判断集合是否为空
        int size()：集合的长度，也就是集合中键值对的个数
*/
public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String, String>();

        //V put(K key,V value)：添加元素
        map.put("男","女");
        map.put("公","母");
        map.put("他","她");

        //V remve(Object key)：根据键删除键值对元素
//        System.out.println(map.remove("公"));
//        System.out.println(map.remove("无"));

        //void clear()：移除所有的键值对元素
//        map.clear();

        //boolean containKey(Object key)：判断集合是否包含指定的键
//        System.out.println(map.containsKey("公"));
//        System.out.println(map.containsKey("无"));

        //boolean containsValue(Object value):判断集合是否包含指定的值
//        System.out.println(map.containsValue("女"));

        //boolean isEmpty()：判断集合是否为空
//        System.out.println(map.isEmpty());

        //int size()：集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

        //输出集合对象
        System.out.println(map);
    }
}
