package com.Wayne_03_factory_pattern;

public class FactoryPattren {
    /*
        定义一个方法，创建对象返回
    */
    public static Computer creatComuter(String info) {
        switch (info) {
            case "huawei":
                Computer c = new Huawei();
                c.setName("huawei pro 16");
                c.setPrice(5999);
                return c;
            case "mac":
                Computer c2 = new Mac();
                c2.setName("MacBook pro");
                c2.setPrice(11999);
                return c2;
            default:
                return null;
        }
    }
}
